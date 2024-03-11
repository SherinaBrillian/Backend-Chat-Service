package com.sherina.hajidanumroh.chat.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatsModel {
    private String chatUid;
    private String roomUid;
    private String sender;
    private String message;
    private String createdAt; 
}
