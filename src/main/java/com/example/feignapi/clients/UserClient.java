package com.example.feignapi.clients;

import com.example.common.ApiResponse;
import com.example.feignapi.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "userservice")
public interface UserClient {
    @GetMapping("/api/users/{id}")
    ResponseEntity<ApiResponse<UserVO>> getUserById(@PathVariable("id") Long userId);

    @PostMapping("/api/users/{id}/avatar")
    ResponseEntity<ApiResponse<String>> uploadAvatar(@PathVariable Long id, @RequestParam String fileUrl);
}