package com.uber_ride_system.strategy;

import com.uber_ride_system.data.Location;

public class FixedPricing implements PricingStrategy{

    public double calculatePrice(Location pickUpLocation, Location dropOffLocation, double basePrice){
        return basePrice;
    }
}
