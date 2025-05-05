package com.pluralsight;

public class Reservations {

    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;
    private float price;
    private float reservationTotal;

    public Reservations(String roomType, float price, boolean isWeekend, int numberOfNights) {
        this.roomType = roomType;
        this.isWeekend = isWeekend;
        this.numberOfNights = numberOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isWeekend() {
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

    public float getPrice() {
        return price;
    }

    public float getReservationTotal() {
        return reservationTotal;
    }
}
