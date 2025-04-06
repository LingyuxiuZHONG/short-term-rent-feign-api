package com.example.feignapi.vo;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class FavoriteCard {
    private Long favoriteId;
    private Long listingId;
    private String title;
    private String address;
    private List<String> images;
    private Double price;
    private Double rating;
    private LocalDateTime createdAt;


}
