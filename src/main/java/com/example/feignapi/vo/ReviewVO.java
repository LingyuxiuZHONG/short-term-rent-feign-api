package com.example.feignapi.vo;

import lombok.Data;

import java.util.Date;

@Data
public class ReviewVO {
    private Long id;
    private Long listingId;
    private Long bookingId;
    private Long reviewerId;
    private Double rating;
    private String content;
    private Date createdAt;
}
