package com.example.feignapi.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CheckDateAvailabilityDTO {
    private List<Long> listingIds;
    private LocalDateTime from;
    private LocalDateTime to;


}
