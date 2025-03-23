package com.example.feignapi.vo;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FavoriteCard {
    private Long favoriteId;
    private Long listingId;
    private String title;
    private String address;
//    private String image;
    private Double price;
    private Double rating;
    private LocalDateTime createdAt;
//    private Integer reviewCount;
    public FavoriteCard(Long favoriteId, FavoriteListing listing,LocalDateTime createdAt) {
        this.favoriteId = favoriteId;
        this.listingId = listing.getListingId();
        this.title = listing.getTitle();
        this.address = listing.getAddress();
        this.price = listing.getPrice();
        this.rating = listing.getRating();
        this.createdAt = createdAt;
    }
}
