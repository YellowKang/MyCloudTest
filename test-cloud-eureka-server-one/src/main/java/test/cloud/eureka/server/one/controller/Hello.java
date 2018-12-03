package test.cloud.eureka.server.one.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/yo")
public class Hello {

    @GetMapping("hello")
    public String hello() throws Exception {

        return "Hello Kang 1";
    }

    Object defaultStores(){
        return "111";
    }

}
