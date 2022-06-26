package daos;

import models.Ride;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RideDao {
    private static Map<String, ArrayList<String>> rideDestinationMap = new HashMap<>();
    private static Map<String, Ride> rideMap = new HashMap<>();

    private RideDao() {}

    public static Map<String, ArrayList<String>> getRideDestinationMap() {
        return rideDestinationMap;
    }

    public static Map<String, Ride> getRideMap() {
        return rideMap;
    }
}
