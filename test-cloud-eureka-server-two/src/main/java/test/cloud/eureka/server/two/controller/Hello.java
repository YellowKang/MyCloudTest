package test.cloud.eureka.server.two.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/yo")
public class Hello {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello Kang 2";
    }

}
