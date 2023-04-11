package com.schuanhe.plook.service.impl;

import com.schuanhe.plook.entity.Room;
import com.schuanhe.plook.entity.RoomChat;
import com.schuanhe.plook.mapper.RoomMapper;
import com.schuanhe.plook.service.RoomService;
import com.schuanhe.plook.utils.CurPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.ManagedList;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service("RoomService")
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomMapper roomMapper;

    @Override
    public boolean addRoom(Integer userId, String roomName) {
        List<String> names = new ManagedList<>();
        CurPool.roomList.put("系统默认房间(幻鹤)",names);
        return false;
    }

    @Override
    public Room getRoomById(Integer id) {
        return roomMapper.getRoomAndChatsById(id);
    }

    @Override
    public boolean addRoomChat(Integer roomId, Integer userId, String data) {
        Timestamp time = new Timestamp(System.currentTimeMillis());//获取当前时间
        RoomChat roomChat = new RoomChat(null , roomId, time, data,userId);
        return roomMapper.addRoomChat(roomChat);
    }
}
