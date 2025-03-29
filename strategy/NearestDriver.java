package com.uber_ride_system.strategy;
import com.uber_ride_system.data.Driver;
import com.uber_ride_system.data.Location;
import  java.util.*;
public class NearestDriver implements DriverAllocationStrategy{

    @Override
    public Driver allocateDriver(List<Driver> availableDriver, Location pickUpLocation) {
        return availableDriver.stream()
                .filter(Driver::isAvailable)
                .findFirst()
                .orElse(null);
    }
}
