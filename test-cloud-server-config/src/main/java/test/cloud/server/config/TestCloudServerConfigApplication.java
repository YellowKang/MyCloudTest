package test.cloud.server.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TestCloudServerConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestCloudServerConfigApplication.class, args);
    }
}
