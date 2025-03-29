package com.uber_ride_system.strategy;

import com.uber_ride_system.data.Location;
import com.uber_ride_system.data.Driver;
import java.util.List;
public class RatingBasedDriver {

    public Driver allocateDriver(List<Driver> availableDriver, Location pickUpLocation) {
        return availableDriver.stream()
                .filter(Driver::isAvailable)
                .findFirst()
                .orElse(null);
    }
}
