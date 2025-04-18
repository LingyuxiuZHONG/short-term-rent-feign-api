package com.example.feignapi.vo;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class ListingSummary {
    private Long id;
    private String title;
    private String description;
    private BigDecimal price;
    private String image;
}
