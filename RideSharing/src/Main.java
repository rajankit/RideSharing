import enums.Strategy;
import services.RideService;
import services.UserService;
import services.VehicleService;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        UserService userService = new UserService();
        VehicleService vehicleService = new VehicleService();
        RideService rideService = new RideService();

        userService.addUser("Rohan",'M', 26);
        userService.addUser("Rahul;",'M', 26);

        vehicleService.addVehicle("Swift", "KA-01-02", "Rohan");
        vehicleService.addVehicle("Swift", "KA-01-03", "Rahul");

        rideService.offerRide("HYD", "BLR", "KA-01-02", 1, "25-Jan-20219 08:40", 1, "Rohan");
        rideService.offerRide("HYD", "BLR", "KA-01-03", 1, "26-Jan-20219 08:50", 5, "Rahul");

        rideService.selectRide("HYD", "BLR", "Shipra", Strategy.FASTEST_RIDE);
        rideService.selectRide("HYD", "BLR", "Puja", Strategy.FASTEST_RIDE);
    }
}