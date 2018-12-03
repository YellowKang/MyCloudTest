package test.cloud.eureka.feign.client;

import org.springframework.stereotype.Component;

@Component
public class FallbackHystrixError implements UserServerClient {


    @Override
    public String hello() {
        return null;
    }
}
