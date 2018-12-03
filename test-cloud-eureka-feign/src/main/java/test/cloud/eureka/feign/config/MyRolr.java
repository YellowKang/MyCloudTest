package test.cloud.eureka.feign.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRolr{


//配置一个随机的算法，调用服务端的时候采取轮随机的模式
//    @Bean
//    public IRule iRule(){
//        return new RandomRule();
//    }

//配置一个自定义的算法，调用服务端的时候采取自定义的负载均衡模式
    @Bean
    public IRule iRule(){
        return new MyIsRule();
    }

}
