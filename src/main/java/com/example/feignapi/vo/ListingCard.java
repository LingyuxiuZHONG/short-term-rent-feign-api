package com.example.feignapi.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ListingCard {

    private Long id;
    private String title;
    private String description;
    private BigDecimal price;
    private String address;
    private Double rating;
    private Integer reviewCount;
    private Integer bedrooms;
    private Integer bathrooms;
    private String listingType;
    private Integer maxGuests;
    private String image;
    private Boolean isFavorite;

}