package com.xyz.springbootstart.process;

import com.xyz.springbootstart.modle.Person;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {

    //private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "test_topic", groupId = "group_id")
    public void consume(String message) throws IOException {
        //logger.info(String.format("#### -> Consumed message -> %s", message));

    System.out.println("#### -> Consumed message :"+ message );
    }
}
