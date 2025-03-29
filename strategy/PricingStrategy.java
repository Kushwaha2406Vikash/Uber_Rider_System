package com.uber_ride_system.strategy;
import com.uber_ride_system.data.Location;
public interface PricingStrategy {

    double calculatePrice(Location pickUpLocation, Location dropOffLocation, double basePrice);
}
