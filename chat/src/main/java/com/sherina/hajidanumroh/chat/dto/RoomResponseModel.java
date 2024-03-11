package com.sherina.hajidanumroh.chat.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomResponseModel {
    private String roomUid;
    private String orderUid;
    private String statusUid;
    private String createdAt;
    private String updateAt;
}
