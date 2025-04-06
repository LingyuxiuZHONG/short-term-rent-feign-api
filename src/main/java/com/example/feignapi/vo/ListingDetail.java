package com.example.feignapi.vo;


import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ListingDetail {
    private Long id;
    private String title;
    private String description;
    private BigDecimal price;
    private String currency = "¥";
    private String priceUnit = "晚";
    private String address;
    private Double rating;
    private Integer bedrooms;
    private Integer bathrooms;
    private String listingType;
    private Integer maxGuests;
    private String checkInInstructions;
    private String cancelPolicy;
    private Double longitude;
    private Double latitude;
    private UserVO host;
    private List<String> rules;
    private List<String> amenities;
    private List<String> images;
}
