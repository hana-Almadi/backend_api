package com.microservice.user_service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
@CrossOrigin()
public class userController {

    @GetMapping("/")
    public ResponseEntity<UserInformation> getUser(){
        UserInformation userInformation = new UserInformation(1L,"احمد",
                "050545453","الرياض","قراءه");
        return new ResponseEntity<>(userInformation, HttpStatus.ACCEPTED);
    }
}
