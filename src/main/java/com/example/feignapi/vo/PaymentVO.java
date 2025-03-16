package com.example.feignapi.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PaymentVO {
    private Long id;
    private Long bookingId;
    private String paymentMethod;
    private BigDecimal amount;
    private Integer status;  // 支付状态
    private String transactionId;
    private String reason;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String payUrl;
}
