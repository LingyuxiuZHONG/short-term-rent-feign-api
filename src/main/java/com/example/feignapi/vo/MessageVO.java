package com.example.feignapi.vo;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MessageVO {
    private Long chatId;
    private Long senderId;
    private String content;
    private Integer messageType; // 0 = text, 1 = image, 2 = video
    private Integer status; // 0 = unread, 1 = read, 2 = revoked
    private LocalDateTime createdAt;
}
