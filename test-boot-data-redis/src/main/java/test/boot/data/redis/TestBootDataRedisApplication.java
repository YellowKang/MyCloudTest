package test.boot.data.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession
public class TestBootDataRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestBootDataRedisApplication.class, args);
    }
}
