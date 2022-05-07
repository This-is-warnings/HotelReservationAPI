package com.example.hotelreservationapi.mappers;

import com.example.hotelreservationapi.domains.Card;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface CardMapper {

    void create(int userId, String number);

    void delete(int id);

    ArrayList<Card> readUserCards(int userId);

    void updateBalance(int id, float balance);

    Card readById(int id);

    void deleteByUserId(int userId);

}
