package test.cloud.eureka.server.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
public class TestCloudEurekaServerTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestCloudEurekaServerTwoApplication.class, args);
    }
}
