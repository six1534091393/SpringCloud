package com.glen.configbusclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigBusClientController {

        @Value("${neo.hello}")
        private String hello;

        @RequestMapping("/hello")
        public String from() {
            return this.hello;
        }

}
