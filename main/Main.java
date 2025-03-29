package com.uber_ride_system.main;
import com.uber_ride_system.data.Driver;
import com.uber_ride_system.data.Location;
import com.uber_ride_system.data.Rider;
import com.uber_ride_system.strategy.PricingStrategy;
import com.uber_ride_system.data.Trip;
import java.util.*;
import com.uber_ride_system.strategy.DriverAllocationStrategy;
import com.uber_ride_system.manager.TripManager;
import com.uber_ride_system.strategy.NearestDriver;
import com.uber_ride_system.strategy.FixedPricing;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("D1", "rocky",  new Location(15.78, 21.34), true, 4.5);
        Driver driver2 = new Driver("D2", "Sam", new Location(21.43, 33.21), true, 4.7);
        List<Driver> availableDrivers = Arrays.asList(driver, driver2);

        Rider rider1 = new Rider("R1", "Alex", new Location(42.21, 12.21));

        DriverAllocationStrategy allocationStrategy = new NearestDriver();
        PricingStrategy pricingStrategy = new FixedPricing();
        TripManager tripManager = new TripManager(allocationStrategy, pricingStrategy);

        Location dropLocation = new Location(56.11, 11.56);
        Trip trip = tripManager.createTrip("t1", rider1, availableDrivers, dropLocation);
        tripManager.completeTrip("t1");
    }
}
