package selectionStrategy;

import daos.RideDao;
import models.Ride;

import java.util.ArrayList;
import java.util.Map;

public class SelectionByFastestRide implements SelectionStrategy {
    private static Map<String, Ride> rideMap = RideDao.getRideMap();
    private ArrayList<String> rides;
    public SelectionByFastestRide(ArrayList<String> rides) {
        this.rides = rides;
    }

    @Override
    public String selectRide() {
        String selectedRide = null;
        int minDuration = 0;

        for(String ride : this.rides) {
            if (rideMap.get(ride).getUsedSeats() == rideMap.get(ride).getAvailableSeats()) continue;

            if (selectedRide == null) {
                selectedRide = ride;
                minDuration = rideMap.get(ride).getDuration();
            } else {
                if (minDuration > rideMap.get(ride).getDuration()) {
                    selectedRide = ride;
                    minDuration = rideMap.get(ride).getDuration();
                }
            }
        }

        return selectedRide;
    }
}
