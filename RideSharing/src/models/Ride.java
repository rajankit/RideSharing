package models;

import java.util.Date;

public class Ride {
    private String source;
    private String destination;
    private String vehicle;
    private int availableSeats;

    private int usedSeats;
    private Date startTime;

    private int duration;
    private String offeredBy;

    public Ride(String source, String destination, String vehicle, int availableSeats, Date startTime, int duration, String offeredBy) {
        this.source = source;
        this.destination = destination;
        this.vehicle = vehicle;
        this.availableSeats = availableSeats;
        this.startTime = startTime;
        this.duration = duration;
        this.offeredBy = offeredBy;
        this.usedSeats = 0;
    }

    public String getOfferedBy() {
        return offeredBy;
    }

    public int getDuration() {
        return duration;
    }

    public int getUsedSeats() {
        return usedSeats;
    }

    public void setUsedSeats(int usedSeats) {
        this.usedSeats = usedSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setOfferedBy(String offeredBy) {
        this.offeredBy = offeredBy;
    }

    public Date getStartTime() {
        return startTime;
    }
}
