package com.xyz.springbootstart;

import com.xyz.springbootstart.modle.Person;
import com.xyz.springbootstart.procedure.Producer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootStartApplication {

	public static void main(String[] args) throws Exception{
        ApplicationContext context = SpringApplication.run(SpringbootStartApplication.class, args);
        Producer producer = context.getBean(Producer.class);

        for (int i = 1; i < 100; i++) {
            producer.send("test_topic", new Person("abc", "test topic message " + i));
            Thread.sleep(2000);
        }
    }
}
