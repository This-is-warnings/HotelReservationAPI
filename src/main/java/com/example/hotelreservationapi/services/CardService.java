package com.example.hotelreservationapi.services;

import com.example.hotelreservationapi.domains.Card;

import java.util.ArrayList;

public interface CardService {

    void createCard(Card card);

    void deleteCard(int id);

    ArrayList<Card> getUserCards(int userId);

    void updateBalance(int id, float balance);

    Card getCardById(int id);
}
