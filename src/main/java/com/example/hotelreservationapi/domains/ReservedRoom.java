package com.example.hotelreservationapi.domains;

import java.sql.Date;
import java.util.Objects;

public class ReservedRoom {

    private int id;

    private float price;

    private boolean isPaid;

    private Date startDate;

    private Date endDate;

    private User user;

    private Room room;
    /* getters and setters */

    /*public ReservedRoom(int id, float price,
                         Date startDate, Date endDate, boolean isPaid){
        this.id = id;
        this.price = price;
        this.isPaid = isPaid;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservedRoom that = (ReservedRoom) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
