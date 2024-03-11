package com.sherina.hajidanumroh.chat.repository;

import java.util.List;

import com.sherina.hajidanumroh.chat.dto.ChatsResponseModel;
import com.sherina.hajidanumroh.chat.dto.request.ChatsRequest;

public interface ChatsRepo {
    void saveData(ChatsRequest chatModel);
    void updateData(ChatsRequest chatModel);
    void deleteData(String chatUid);
    List<ChatsResponseModel> getAll();
    ChatsResponseModel getById(String roomUid);
    
}
