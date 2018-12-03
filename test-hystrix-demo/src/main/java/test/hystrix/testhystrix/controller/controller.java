package test.hystrix.testhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//标注一个controller控制器
@Controller
public class controller {


    @ResponseBody//返回一个json字符串
    @GetMapping("/helloHystrix")//控制器url路径
    @HystrixCommand(fallbackMethod = "errorHystrix")//这里就是我们的熔断机制，和熔断调用的方法
    public String helloHystrix() throws Exception {

        //模拟一个异常的请求
        if(1 == 1){
            throw new Exception("报错了");
        }
        return "Hello";
    }

    //切记失败后返回的处理的返回值类型和参数都要一直，甚至是声明的异常
    public String errorHystrix() throws Exception {
        return "大兄弟报错了";
    }

}
