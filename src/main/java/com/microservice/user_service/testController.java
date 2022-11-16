package com.microservice.user_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class testController {

    @GetMapping("/test")
    public String test(){
        return "hi";
    }
}
