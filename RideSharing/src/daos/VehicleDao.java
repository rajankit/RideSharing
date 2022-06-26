package daos;

import models.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleDao {
    private static Map<String, Vehicle> vehicleMap = new HashMap<>();
    private VehicleDao() {}
    public static Map<String, Vehicle> getVehicleMap() {
        return vehicleMap;
    }
}
