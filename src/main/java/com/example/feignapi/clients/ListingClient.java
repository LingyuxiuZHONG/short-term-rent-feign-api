package com.example.feignapi.clients;


import com.example.common.ApiResponse;
import com.example.feignapi.vo.FavoriteCard;
import com.example.feignapi.vo.FavoriteListing;
import com.example.feignapi.vo.ListingCard;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("listingservice")
public interface ListingClient {

    @GetMapping("/api/listings/{id}")
    ResponseEntity<ApiResponse<ListingCard>> checkIfListingExists(@PathVariable Long id);

    @PutMapping("/api/listings/{id}/rating")
    ResponseEntity<ApiResponse<Double>> updateListingRating(@PathVariable Long id, @RequestBody Double rating);

    @PostMapping("/api/listings/favoriteListings")
    ResponseEntity<ApiResponse<List<FavoriteListing>>> getFavoriteListings(@RequestBody List<Long> listingIds);

    @PostMapping("/api/listings/{id}/images")
    ResponseEntity<ApiResponse<String>> uploadImages(@PathVariable Long id, @RequestParam("imageFiles") List<String> fileUrls);
}
