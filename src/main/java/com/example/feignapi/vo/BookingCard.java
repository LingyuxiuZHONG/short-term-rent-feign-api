package com.example.feignapi.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class BookingCard {
    private Long id;              // 预订ID
    private Long listingId;       // 房源ID
    private Long guestId;         // 房客ID
    private Long hostId;          // 房东ID
    private LocalDate startDate;  // 入住日期
    private LocalDate endDate;    // 退房日期
    private Integer guestCount;   // 入住人数
    private BigDecimal totalAmount;  // 订单总金额
    private BigDecimal paidAmount;   // 实际支付金额
    private BigDecimal discountAmount; // 优惠金额
    private Integer status;        // 订单状态（待支付、已确认等）

    private Integer cancelledBy;
    private String cancelReason;
    private Integer cancelPolicy;

    private LocalDateTime createdAt; // 预订创建时间
    private LocalDateTime updatedAt; // 预订更新时间
    private LocalDateTime paidAt;    // 支付时间
    private LocalDateTime cancelledAt; // 取消时间
    private LocalDateTime completedAt; // 完成时间

    private ListingDetail listingDetail;
}
