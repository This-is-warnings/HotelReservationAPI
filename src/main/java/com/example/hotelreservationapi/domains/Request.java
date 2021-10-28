package com.example.hotelreservationapi.domains;

import java.sql.Date;
import java.util.Objects;

public class Request {

    private int id;

    private User user;

    private int numberOfRooms;

    private String roomClass;

    private Date startDate;

    private Date endDate;

    private String status;

    public Request(int id, int numberOfRooms,
                   String roomClass, Date startDate, Date endDate, String status) {
        this.id = id;
        this.numberOfRooms = numberOfRooms;
        this.roomClass = roomClass;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }


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
        Request requests = (Request) o;
        return id == requests.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
