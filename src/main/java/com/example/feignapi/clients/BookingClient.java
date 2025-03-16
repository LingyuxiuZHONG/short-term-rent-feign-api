package com.example.feignapi.clients;


import com.example.common.ApiResponse;
import com.example.feignapi.dto.CheckDateAvailabilityDTO;
import com.example.feignapi.dto.UpdateBookingPaymentDTO;
import com.example.feignapi.vo.BookingVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "bookingservice")
public interface BookingClient {
    @GetMapping("/api/bookings/{id}")
    ResponseEntity<ApiResponse<BookingVO>> checkIfBookingExists(@PathVariable("id") Long bookingId);

    @PutMapping("/api/bookings/updatePayment")
    ResponseEntity<ApiResponse<String>> updateBookingPayment(@RequestBody UpdateBookingPaymentDTO updateBookingPaymentDTO);

    @PostMapping("/api/bookings/checkDateAvailability")
    ResponseEntity<ApiResponse<List<Long>>> checkDateAvailability(@RequestBody CheckDateAvailabilityDTO checkDateAvailabilityDTO);

}
