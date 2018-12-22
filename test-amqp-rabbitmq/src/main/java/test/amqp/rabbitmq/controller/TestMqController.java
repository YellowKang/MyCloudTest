package test.amqp.rabbitmq.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import test.amqp.rabbitmq.bean.Rabt;

@Controller
@Component
public class TestMqController {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @ResponseBody
    @GetMapping("/test")
    public String testmq(){
        Rabt rabt = new Rabt(1,"康哥","手机");
        amqpTemplate.convertAndSend("myEx","phone",rabt);
        return "asdasd";
    }

    @ResponseBody
    @GetMapping("/testMy")
    public String testMyMq(){
        Rabt rabt = new Rabt(2,"康哥","电脑");
        amqpTemplate.convertAndSend("myEx","computer",rabt);
        return "asdasd";
    }
}
