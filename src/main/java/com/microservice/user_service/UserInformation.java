package com.microservice.user_service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInformation {

    private Long id;
    private String name;
    private String phoneName;
    private String city;
    private String hobby;
}
