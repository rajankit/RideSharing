package services;

import daos.RideDao;
import enums.Strategy;
import models.Ride;
import selectionStrategy.SelectionByEarliestRide;
import selectionStrategy.SelectionByFastestRide;
import selectionStrategy.SelectionStrategy;

import java.util.ArrayList;
import java.util.Map;

public class RideSelectionService {
    public String selectRide(ArrayList<String> rides, Strategy strategy) {
        SelectionStrategy selectionStrategy;

        if (strategy == Strategy.EARLIEST_RIDE) {
            selectionStrategy = new SelectionByEarliestRide(rides);
        } else {
            selectionStrategy = new SelectionByFastestRide(rides);
        }

        return selectionStrategy.selectRide();
    }
}
