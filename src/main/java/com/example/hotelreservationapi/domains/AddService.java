package com.example.hotelreservationapi.domains;

import java.util.Objects;

public class AddService {
    private int id;

    private String name;

    public AddService(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddService addService = (AddService) o;
        return id == addService.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
