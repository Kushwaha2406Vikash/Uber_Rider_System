package com.uber_ride_system.data;


public class Driver {
    private String id;
    private String name;
    private Location location;
    private boolean isAvailable;
    private double rating;

    public Driver(String id, String name, Location location, boolean isAvailable, double rating) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.isAvailable = isAvailable;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
}