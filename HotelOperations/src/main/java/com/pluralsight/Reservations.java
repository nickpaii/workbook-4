package com.pluralsight;

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

    public String getRoomType() {
        roomType = roomType.toLowerCase();

        if (roomType.equals("king")) {
            price = 139;
        }
        if (roomType.equals("double")) {
            price = 124;
        }

        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isWeekend() {
        if (isWeekend) {
            price = price + (price * .10f);
        }
        return isWeekend;
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
