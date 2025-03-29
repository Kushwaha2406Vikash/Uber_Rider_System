# Uber Ride System - Low-Level Design

## Overview
The **Uber Ride System** is a Java-based implementation of a ride-hailing service. This project demonstrates the low-level design of an Uber-like system, handling rider requests, driver allocation, trip pricing, and trip completion using a strategy-based approach.

## Features
- Rider and driver management
- Nearest driver allocation strategy
- Fixed pricing strategy
- Trip creation and completion

## Technologies Used
- **Java** (Core programming language)
- **Object-Oriented Programming (OOP)** (Encapsulation, Abstraction, Polymorphism, Inheritance)
- **Strategy Design Pattern** (For driver allocation and pricing strategies)

## Project Structure
```
com.uber_ride_system
│── main
│   ├── Main.java                 # Entry point of the application
│
├── data
│   ├── Driver.java               # Driver entity with location and rating
│   ├── Location.java             # Location entity (latitude, longitude)
│   ├── Rider.java                # Rider entity with pickup location
│   ├── Trip.java                 # Trip entity containing trip details
│
├── strategy
│   ├── DriverAllocationStrategy.java  # Interface for driver allocation strategy
│   ├── NearestDriver.java             # Implementation of nearest driver allocation
│   ├── PricingStrategy.java           # Interface for pricing strategy
│   ├── FixedPricing.java              # Implementation of fixed pricing
│
├── manager
│   ├── TripManager.java           # Manages trip creation and completion
```

## How It Works
1. **Driver Creation:** Drivers are instantiated with unique IDs, names, locations, availability status, and ratings.
2. **Rider Request:** A rider requests a ride by specifying a pickup location.
3. **Driver Allocation:** The system selects the nearest available driver using the `NearestDriver` strategy.
4. **Pricing Calculation:** The ride cost is determined using the `FixedPricing` strategy.
5. **Trip Management:** A trip is created and completed through the `TripManager` class.

## Usage
### Running the Application
Ensure you have **Java installed**. Compile and run the `Main.java` file:
```sh
javac -d . Main.java
java com.uber_ride_system.main.Main
```

### Sample Execution Output
```
Trip Created: Trip ID - t1, Rider - Alex, Driver - Rocky
Trip Completed: Trip ID - t1
```

## Future Enhancements
- Implement dynamic pricing strategy based on distance and demand.
- Enhance driver allocation with traffic and ETA considerations.
- Add a real-time tracking feature.

## Author
Developed as a low-level design project for an Uber-like ride-hailing system.

## License
This project is licensed under the MIT License.

