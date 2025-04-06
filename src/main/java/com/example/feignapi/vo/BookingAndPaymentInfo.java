package com.example.feignapi.vo;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookingAndPaymentInfo {
    private BookingVO bookingVO;
    private PaymentVO paymentVO;
}
