package com.gfg.refreshservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;

@SpringBootApplication
@RemoteApplicationEventScan
public class RefreshServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RefreshServiceApplication.class, args);
    }

}
