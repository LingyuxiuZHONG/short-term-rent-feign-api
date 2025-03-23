package com.example.feignapi.vo;


import lombok.Data;

@Data
public class UserVO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String avatar;
    private String description;
    private Integer roleType;
    private String token;
}
