package test.cloud.eureka.feign.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

//自定义的负载均衡算法类，继承我们的实现类然后使用里面的方法
public class MyIsRule extends AbstractLoadBalancerRule {

    /**
     * 这里我们采用的方法是每个服务我们去随机的查询他3次，也就是说随机访问这些服务，
     * 每个服务访问三次连续的
     */



    //我们定义一个访问的次数
    private int total = 0;
    //我们定义访问的服务是哪个
    private int serverMy = 0;

    //用来存储随机访问的那个服务
    private static int randomServer = 0;


    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }

                List<Server> upList = lb.getReachableServers();
                List<Server> allList = lb.getAllServers();

                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }

                /**
                 * 这里是我们自定义的每个服务轮询访问，每个服务访问5次
                 */
//                if(total < 5){
//                    server = upList.get(serverMy);
//                    total++;
//                }else {
//                    total=0;
//                    serverMy++;
//                    if(serverMy >= upList.size()){
//                        serverMy=0;
//                    }
//
//                }



                //我们先判断是不是循环三次内
                if(total < 3){
                    //由于这里实现真正的完全随机有点麻烦所以第一次我们先访问3次第一台服务
                    server = upList.get(randomServer);

                    //让我们的重复访问增加，大于三次清空
                    total++;
                }else {

                    //清空重复访问
                    total=0;

                    //随机我们的服务的多少然后得到一个随机数，这个就是我们的随机的访问服务
                    randomServer = (int)(Math.random() * upList.size());
                }


                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }
                    server = null;
                    Thread.yield();
                }
            }

            return server;
        }
    }

    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}
