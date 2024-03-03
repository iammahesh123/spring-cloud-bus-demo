package com.gfg.refreshservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefreshController {

    private static final String EXCHANGE_NAME = "refresh-exchange";
    private static final String ROUTING_KEY = "refresh-event";

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/refresh")
    public void refresh() {
        rabbitTemplate.convertAndSend(EXCHANGE_NAME, ROUTING_KEY, "Refresh configuration");
    }
}


