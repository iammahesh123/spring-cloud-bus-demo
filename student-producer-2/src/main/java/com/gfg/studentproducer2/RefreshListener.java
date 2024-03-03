package com.gfg.studentproducer2;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RefreshListener {

    @RabbitListener(queues = "${spring.rabbitmq.queue-name}")
    public void processMessage(String message) {
        if ("Refresh configuration".equals(message)) {
            // Perform configuration refresh here
            System.out.println("Received refresh event. Refreshing configuration...");
        }
    }
}

