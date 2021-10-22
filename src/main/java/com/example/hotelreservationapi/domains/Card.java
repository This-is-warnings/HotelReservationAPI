package com.example.hotelreservationapi.domains;

import java.util.Objects;

public class Card {

    private int id;

    private String number;

    private float balance;

    private User user;

    public Card(int id, String number, float balance){
        this.id = id;
        this.number = number;
        this.balance = balance;
    }

    /*public Card(int id, String number, float balance, User user){
        this.id = id;
        this.number = number;
        this.balance = balance;
        this.user = user;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card cards = (Card) o;
        return id == cards.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
