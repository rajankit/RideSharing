package services;

import daos.RideDao;
import daos.UserDao;
import enums.Strategy;
import models.Ride;
import models.User;
import utils.DateFormatter;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Map;

public class RideService {
    private static Map<String, ArrayList<String>> rideDestinationMap = RideDao.getRideDestinationMap();
    private static Map<String, Ride> rideMap = RideDao.getRideMap();
    private static Map<String, User> userMap = UserDao.getUserMap();
    private RideSelectionService rideSelectionService = new RideSelectionService();

    private ArrayList<String> getFilteredRides(ArrayList<String> rides, String user) {
        ArrayList<String> filteredRides = new ArrayList<>();

        for(String ride : rides) {
            if (rideMap.get(ride).getOfferedBy() == user) continue;

            filteredRides.add(ride);
        }

        return filteredRides;
    }

    public void offerRide(String source, String destination, String vehicle, int availableSeats, String startTime, int duration, String offeredBy) throws ParseException {
        DateFormatter dateFormatter = new DateFormatter(startTime);
        Ride ride = new Ride(source, destination, vehicle, availableSeats, dateFormatter.getDate(), duration, offeredBy);

        String destinationId = source + "-" + destination;
        String rideId = offeredBy + "-" + vehicle;

        if (!rideDestinationMap.containsKey(destinationId)) {
            rideDestinationMap.put(destinationId, new ArrayList<>());
        }

        rideDestinationMap.get(destinationId).add(rideId);
        rideMap.put(rideId, ride);

//        userMap.get(offeredBy).setRideOffered(userMap.get(offeredBy).getRideOffered() + 1);
    }

    public void selectRide(String source, String destination, String user, Strategy strategy) {
        String destinationId = source + "-" + destination;

        if (!rideDestinationMap.containsKey(destinationId) || rideDestinationMap.get(destinationId).size() == 0) {
            System.out.println("No Rides found!!!!");
            return;
        }

        ArrayList<String> rides = getFilteredRides(rideDestinationMap.get(destinationId), user);

        if (rides.size() == 0) {
            System.out.println("No Rides found!!!!");
            return;
        }

        String rideId = rideSelectionService.selectRide(rides, strategy);

        if (rideId == null) {
            System.out.println("No Rides found!!!");
            return;
        }

        rideMap.get(rideId).setUsedSeats(rideMap.get(rideId).getUsedSeats() + 1);
        Ride ride = rideMap.get(rideId);

//        userMap.get(user).setFuelSaved(userMap.get(user).getFuelSaved() + ride.getDuration());
//        userMap.get(user).setRideTaken(userMap.get(user).getRideTaken() + 1);

        System.out.println("Details: offered By " + ride.getOfferedBy() + " at " + ride.getStartTime() + ", Vehicle Details: "  + ride.getVehicle());
    }
}
