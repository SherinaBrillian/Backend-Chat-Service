package com.sherina.hajidanumroh.chat.service;

import com.sherina.hajidanumroh.chat.dto.request.ChatsRequest;
import com.sherina.hajidanumroh.chat.dto.response.ChatsDataResponse;
import com.sherina.hajidanumroh.chat.dto.response.ChatsListResponse;
import com.sherina.hajidanumroh.chat.dto.response.WebResponseBase;

public interface ChatsService {
    WebResponseBase saveData(ChatsRequest chatsModel);
    WebResponseBase updateData(ChatsRequest chatsModel);
    WebResponseBase deleteData(String chatUid);
    ChatsListResponse getAll();
    ChatsDataResponse getById(String roomUid);

    
}
