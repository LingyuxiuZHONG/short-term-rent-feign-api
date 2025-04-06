package com.example.feignapi.dto;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class RefundDTO {
    private Long bookingId;
    private BigDecimal refundAmount;
    private String reason;
}
