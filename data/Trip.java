package com.uber_ride_system.data;


public class Trip {
    private String id;
    private Rider rider;
    private Driver driver;
    private Location pickupLocation;
    private Location dropOffLocation;
    private TripStatus status;

    public Trip(String id, Rider rider, Driver driver, Location pickupLocation, Location dropOffLocation) {
        this.id = id;
        this.rider = rider;
        this.driver = driver;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
    }

    public String getId() {
        return id;
    }

    public Rider getRider() {
        return rider;
    }

    public Driver getDriver() {
        return driver;
    }

    public Location getPickupLocation() {
        return pickupLocation;
    }

    public Location getDropOffLocation() {
        return dropOffLocation;
    }

    public TripStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "id='" + id + '\'' +
                ", rider=" + rider +
                ", driver=" + driver +
                ", pickupLocation=" + pickupLocation +
                ", dropOffLocation=" + dropOffLocation +
                ", status=" + status +
                '}';
    }

    public void completeTrip() {
    }
}