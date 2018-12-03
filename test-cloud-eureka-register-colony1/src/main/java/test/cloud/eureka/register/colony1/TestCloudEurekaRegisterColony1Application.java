package test.cloud.eureka.register.colony1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TestCloudEurekaRegisterColony1Application {

    public static void main(String[] args) {
        SpringApplication.run(TestCloudEurekaRegisterColony1Application.class, args);
    }
}
