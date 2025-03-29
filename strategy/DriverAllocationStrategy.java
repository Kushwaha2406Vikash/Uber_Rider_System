package com.uber_ride_system.strategy;

import com.uber_ride_system.data.Driver;
import java.util.List;
import com.uber_ride_system.data.Location;

public interface DriverAllocationStrategy {
    Driver allocateDriver(List<Driver> availableDriver, Location pickUpLocation);
}
