package test.cloud.eureka.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import test.cloud.eureka.feign.client.UserServerClient;


@Controller
public class Hello {

    @Autowired
    private UserServerClient userServerClient;

    @ResponseBody
    @GetMapping("hello")
    public String hello(){
        return userServerClient.hello();
    }




}
