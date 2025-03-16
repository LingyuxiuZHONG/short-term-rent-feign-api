package com.example.feignapi.vo;


import lombok.Data;

@Data
public class UserVO {
    private Long id;
    private String username;
    private String email;
    private String phoneNumber;
    private String profileImage;
    private String description;
    private Long roleId;
    private String token;
}
