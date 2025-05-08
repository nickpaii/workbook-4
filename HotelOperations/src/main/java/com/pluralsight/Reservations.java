package com.pluralsight;

import java.util.InputMismatchException;

public class Reservations {

    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;
    private float price;


    public Reservations(String roomType, boolean isWeekend, int numberOfNights) {
        this.roomType = roomType;
        this.isWeekend = isWeekend;
        this.numberOfNights = numberOfNights;
        getRoomType();
        getReservationTotal();
        isWeekend();
    }

    public void getRoomType() {
        roomType = roomType.toLowerCase();

        if (roomType.equals("king")) {
            price = 139;
        }
        else if (roomType.equals("double")) {
            price = 124;
        }
        else {
            throw new InputMismatchException("Please enter the correct room type.");
        }


    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void isWeekend() {
        if (isWeekend) {
            price = price + (price * .10f);
        }
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public float getReservationTotal() {
        return price * numberOfNights;
    }
}
