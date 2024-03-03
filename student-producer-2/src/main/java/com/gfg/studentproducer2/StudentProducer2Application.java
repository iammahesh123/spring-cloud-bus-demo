package com.gfg.studentproducer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StudentProducer2Application {

    public static void main(String[] args) {
        SpringApplication.run(StudentProducer2Application.class, args);
    }

}
