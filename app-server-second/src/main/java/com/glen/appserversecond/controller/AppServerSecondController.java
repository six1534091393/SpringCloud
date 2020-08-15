package com.glen.appserversecond.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppServerSecondController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/test")
    public String test(){
        return "Hello,world，恭喜您调用成功了，这个是appServerSecond,port为：" +port;
    }
}
