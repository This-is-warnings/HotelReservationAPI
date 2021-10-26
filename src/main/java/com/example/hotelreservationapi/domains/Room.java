package com.example.hotelreservationapi.domains;

import java.util.Objects;

public class Room {

    private int id;

    private int number;

    private int numberOfRooms;

    private String roomClass;

    private float pricePerDay;

    private boolean isFree;

    /*public Room(int id, int number, int numberOfRooms, String roomClass,
                float pricePerDay, boolean isFree){
        this.id = id;
        this.number = number;
        this.numberOfRooms = numberOfRooms;
        this.roomClass = roomClass;
        this.pricePerDay = pricePerDay;
        this.isFree = isFree;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getRoomClass() {
        return roomClass;
    }

    public void setRoomClass(String roomClass) {
        this.roomClass = roomClass;
    }

    public float getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(float pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return id == room.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
