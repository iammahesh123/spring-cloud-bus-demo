package com.gfg.studentproducer1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.DirectExchange;


@Configuration
public class RabbitMQConfig {

    @Bean
    public DirectExchange refreshExchange() {
        return new DirectExchange("refresh-exchange");
    }
}


