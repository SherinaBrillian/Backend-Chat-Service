package com.sherina.hajidanumroh.chat.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatsResponseModel {
    private String chatUid;
    private String roomUid;
    private String sender;
    private String message;
    private String createdAt;    
}
