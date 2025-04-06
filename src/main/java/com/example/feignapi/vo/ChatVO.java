package com.example.feignapi.vo;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ChatVO {
    private Long id;
    private Long hostId;
    private Long guestId;
    private Long listingId;
    private String lastMessage;
    private LocalDateTime lastMessageTime;
    private UserVO otherUser;
}
