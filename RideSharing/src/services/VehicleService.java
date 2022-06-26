package services;

import daos.UserDao;
import daos.VehicleDao;
import models.User;
import models.Vehicle;

import java.util.Map;

public class VehicleService {
    private static Map<String, Vehicle> vehicleMap = VehicleDao.getVehicleMap();

    public void addVehicle(String name, String number, String offeredBy) {
        Vehicle vehicle = new Vehicle(name, number, offeredBy);
        vehicleMap.put(number, vehicle);
    }
}
