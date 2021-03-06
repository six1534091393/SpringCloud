package com.glen.appserverfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan("com.glen")
@SpringBootApplication
public class AppServerFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppServerFirstApplication.class, args);
    }

}
