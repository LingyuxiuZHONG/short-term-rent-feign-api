package com.example.feignapi.vo;


import lombok.Data;

@Data
public class FavoriteListing {
    private Long listingId;
    private String title;
    private String address;
    //    private String image;
    private Double price;
    private Double rating;
//    private Integer reviewCount;
}
