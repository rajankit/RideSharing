package selectionStrategy;

import daos.RideDao;
import models.Ride;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class SelectionByEarliestRide implements SelectionStrategy {
    private static Map<String, Ride> rideMap = RideDao.getRideMap();
    private ArrayList<String> rides;
    public SelectionByEarliestRide(ArrayList<String> rides) {
        this.rides = rides;
    }

    @Override
    public String selectRide() {
        String selectedRide = null;
        Date currDate = null;

        for(String ride : this.rides) {
            if (rideMap.get(ride).getUsedSeats() == rideMap.get(ride).getAvailableSeats()) continue;

            if (selectedRide == null) {
                selectedRide = ride;
                currDate = rideMap.get(ride).getStartTime();
            } else {
                if (currDate.compareTo(rideMap.get(ride).getStartTime()) > 0) {
                    selectedRide = ride;
                    currDate = rideMap.get(ride).getStartTime();
                }
            }
        }

        return selectedRide;
    }
}
