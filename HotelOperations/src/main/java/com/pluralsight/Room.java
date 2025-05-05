package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private float price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room (int numberOfBeds, boolean isDirty, float price, boolean isOccupied) {
        this.numberOfBeds = numberOfBeds;
        this.isDirty = isDirty;
        this.price = price;
        this.isOccupied = isOccupied;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean isAvailable() {
        return isDirty && isOccupied;
    }

    public float getPrice() {
        return price;
    }
}
