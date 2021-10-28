package com.example.hotelreservationapi.services;

import com.example.hotelreservationapi.domains.Card;
import com.example.hotelreservationapi.mappers.CardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    CardMapper cardMapper;

    @Override
    public void createCard(Card card) {
        cardMapper.create(card);
    }

    @Override
    public void deleteCard(int id) {
        cardMapper.delete(id);
    }

    @Override
    public ArrayList<Card> getUserCards(int userId) {
        System.out.println("user id " + userId);
        return cardMapper.readUserCards(userId);
    }

    @Override
    public void updateBalance(int id, float balance) {
        cardMapper.updateBalance(id, balance);
    }

    @Override
    public Card getCardById(int id) {
        return cardMapper.readById(id);
    }
}
