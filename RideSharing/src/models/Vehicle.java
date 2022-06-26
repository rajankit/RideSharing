package models;

public class Vehicle {
    private String name;
    private String number;
    private String offeredBy;

    public Vehicle(String name, String number, String offeredBy) {
        this.name = name;
        this.number = number;
        this.offeredBy = offeredBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOfferedBy() {
        return offeredBy;
    }

    public void setOfferedBy(String offeredBy) {
        this.offeredBy = offeredBy;
    }
}
