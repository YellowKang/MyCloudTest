package test.boot.data.redis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class Test {

    @GetMapping("testredis")
    @ResponseBody
    public String redis(HttpSession httpSession){
        httpSession.setAttribute("nice","添加成功！" );
        return  "插入成功！";
    }

    @GetMapping("get")
    @ResponseBody
    public Object nice(HttpSession session){
        return session.getAttribute("nice");
    }

}
