package com.example.feignapi.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class UpdateBookingPaymentDTO {
    private Long bookingId;
    private BigDecimal paidAmount;
    private Integer status;
    private String paymentTransactionId;
    private String refundTransactionId;
}
