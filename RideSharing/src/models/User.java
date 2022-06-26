package models;

public class User {
    private String name;
    private Character gender;
    private int age;

    private int fuelSaved;

    private int rideTaken;
    private int rideOffered;

    public User(String name, Character gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.fuelSaved = 0;
        this.rideTaken = 0;
        this.rideOffered = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFuelSaved() {
        return fuelSaved;
    }

    public void setFuelSaved(int fuelSaved) {
        this.fuelSaved = fuelSaved;
    }

    public int getRideTaken() {
        return rideTaken;
    }

    public void setRideTaken(int rideTaken) {
        this.rideTaken = rideTaken;
    }

    public int getRideOffered() {
        return rideOffered;
    }

    public void setRideOffered(int rideOffered) {
        this.rideOffered = rideOffered;
    }
}
