package com.example.feignapi.clients;


import com.example.common.ApiResponse;
import com.example.feignapi.vo.ListingCard;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("listingservice")
public interface ListingClient {

    @GetMapping("/api/listings/{id}")
    ResponseEntity<ApiResponse<ListingCard>> checkIfListingExists(@PathVariable Long id);

    @PutMapping("/api/listings/{id}/rating")
    ResponseEntity<ApiResponse<Double>> updateListingRating(@PathVariable Long id, @RequestBody Double rating);

}
