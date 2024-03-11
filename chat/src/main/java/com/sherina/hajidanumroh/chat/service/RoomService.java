package com.sherina.hajidanumroh.chat.service;

import com.sherina.hajidanumroh.chat.dto.request.RoomRequest;
import com.sherina.hajidanumroh.chat.dto.response.RoomDataResponse;
import com.sherina.hajidanumroh.chat.dto.response.RoomListResponse;
import com.sherina.hajidanumroh.chat.dto.response.WebResponseBase;

public interface RoomService {
    WebResponseBase saveData(RoomRequest roomModel);
    WebResponseBase updateData(RoomRequest roomModel);
    WebResponseBase deleteData(String roomUid);
    RoomListResponse getAll();
    RoomDataResponse getById(String roomUid);
}
