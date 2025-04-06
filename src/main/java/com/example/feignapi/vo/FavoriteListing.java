package com.example.feignapi.vo;


import lombok.Data;

import java.util.List;

@Data
public class FavoriteListing {
    private Long listingId;
    private String title;
    private String address;
    private List<String> images;
    private Double price;
    private Double rating;
}
