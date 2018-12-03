package test.cloud.eureka.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


//Feign客户端连接，路径yo，映射服务的路径，发生错误后熔断器处理的类
@FeignClient(value = "Test-User-Server-One",path = "/yo",fallback = FallbackHystrixError.class)
public interface UserServerClient {

    //访问Test-User-Server-One，服务下面的/yo/hello，然后给客户端的controller调用
    @GetMapping("hello")
    String hello();

}
