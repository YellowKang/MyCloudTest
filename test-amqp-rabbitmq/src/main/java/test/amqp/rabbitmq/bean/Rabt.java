package test.amqp.rabbitmq.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@AllArgsConstructor
public class Rabt implements Serializable {
    private Integer id;
    private String name;
    private String type;

    public Rabt(){

    }
}
