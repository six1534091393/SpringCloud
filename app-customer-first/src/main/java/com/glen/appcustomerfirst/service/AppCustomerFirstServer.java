package com.glen.appcustomerfirst.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "app-server")
public interface AppCustomerFirstServer {

    @RequestMapping("/test")
    public String test();

}
