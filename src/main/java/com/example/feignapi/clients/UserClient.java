package com.example.feignapi.clients;

import com.example.common.ApiResponse;
import com.example.feignapi.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "userservice")
public interface UserClient {
    @GetMapping("/api/users/{id}")
    ResponseEntity<ApiResponse<UserVO>> checkIfUserExists(@PathVariable("id") Long userId);

}