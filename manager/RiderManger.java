package com.uber_ride_system.manager;
import java.util.*;
import com.uber_ride_system.data.Rider;
public class RiderManger {

    private Map<String, Rider> riders = new HashMap<>();
    public Rider getRider(String id) {
        return riders.get(id);
    }
}
