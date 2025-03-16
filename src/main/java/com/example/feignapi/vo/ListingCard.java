package com.example.feignapi.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ListingCard {

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
    private Boolean isFavorite;
    private String listingType;  // 房源类型ID

}