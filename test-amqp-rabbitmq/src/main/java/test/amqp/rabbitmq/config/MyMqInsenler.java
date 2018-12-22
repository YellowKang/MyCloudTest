package test.amqp.rabbitmq.config;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import test.amqp.rabbitmq.bean.Rabt;

@Component
public class MyMqInsenler {

//    @RabbitListener(queues = "MyAmqp")
//    监听这个 "MyAmqp" 这个消息，必须是现有的创建过的MQ

//    @RabbitListener(queuesToDeclare = @Queue("MyAmqp"))
//    监听这个 "MyAmqp" 这个消息，如果有的话就监听他，如果没有的话就创建一个

    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange("myEx"),
            key = "phone",
            value = @Queue("myMq")
    ))
    public void MyMqtListener(Rabt rabt){
        System.out.println("MyComputer message： " + rabt);
    }

    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange("myEx"),
            key = "computer",
            value = @Queue("MyAmqp")
    ))
    public void MyOderComputer(Rabt rabt){
        System.out.println("MyComputer message： " + rabt);
    }





}
