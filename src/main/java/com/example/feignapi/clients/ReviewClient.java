package com.example.feignapi.clients;

import com.example.common.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("reviewservice")
public interface ReviewClient {
    @PostMapping("/api/reviews/{id}/images")
    ResponseEntity<ApiResponse<String>> uploadImages(@PathVariable Long id, @RequestParam("fileUrls") List<String> fileUrls);

    @GetMapping("/api/reviews/listings/{listingId}/count")
    ResponseEntity<ApiResponse<Integer>> getReviewCountByListingId(@PathVariable Long listingId);


    }
