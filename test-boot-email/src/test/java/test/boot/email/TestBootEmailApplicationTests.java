package test.boot.email;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import test.boot.email.config.EmailTool;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestBootEmailApplicationTests {

    @Autowired
    private EmailTool emailTool;

    @Test
    public void contextLoads() {
        emailTool.sendSimpleMail();
    }

}

