package com.ThePurgeOBREZ.TZ.model;

public class Room {
    private Integer id;
    private String country;

    public Room() {
    }

    public Room(Integer id, String country) {
        this.id = id;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}