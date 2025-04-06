package com.example.feignapi.vo;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class BookingUpdateAfterPayDTO {
    private Integer code;
    private String tradeNo;
    private BigDecimal paid_amount;
}
