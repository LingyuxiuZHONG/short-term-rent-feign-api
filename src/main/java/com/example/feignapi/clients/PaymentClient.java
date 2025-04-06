package com.example.feignapi.clients;


import com.example.common.ApiResponse;
import com.example.feignapi.dto.RefundDTO;
import com.example.feignapi.vo.PaymentVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "paymentservice")
public interface PaymentClient {
    @PostMapping("/api/payments/{paymentId}/simulateRefundFailure")
    ResponseEntity<ApiResponse<String>> simulateRefundFailure(@PathVariable Long paymentId);

    @PostMapping("/api/payments/{paymentId}/simulateRefundSuccess")
    ResponseEntity<ApiResponse<String>> simulateRefundSuccess(@PathVariable Long paymentId);

    @PostMapping("/api/payments/refund")
    ResponseEntity<ApiResponse<PaymentVO>> refund(@RequestBody RefundDTO refundDTO);
}
