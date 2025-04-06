package com.example.feignapi.vo;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserCard {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String avatar;
    private String description;
    private Integer roleType;
    private LocalDateTime createdAt;
}
