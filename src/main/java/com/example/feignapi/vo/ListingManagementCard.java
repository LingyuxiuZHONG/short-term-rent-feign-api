package com.example.feignapi.vo;


import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ListingManagementCard {
    private Long id;
    private String title;
    private String description;
    private BigDecimal price;
    private String address;
    private Integer bedrooms;
    private Integer bathrooms;
    private String listingType;
    private Integer maxGuests;
    private String checkInInstructions;
    private String cancelPolicy;
    private List<String> rules;
    private List<String> images;
    private List<String> amenities;
    private List<BookingVO> bookings;

}
