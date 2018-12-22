package test.hystrix.testhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
//开启熔断组件
@EnableHystrix
public class TestHystrixDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestHystrixDemoApplication.class, args);
    }
}
