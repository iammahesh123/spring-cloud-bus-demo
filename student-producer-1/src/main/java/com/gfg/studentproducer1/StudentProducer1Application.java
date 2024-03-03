package com.gfg.studentproducer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StudentProducer1Application {

    public static void main(String[] args) {
        SpringApplication.run(StudentProducer1Application.class, args);
    }

}
