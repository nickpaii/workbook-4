package com.pluralsight;

public class Main {


    public static void main(String[] args) {

        Room room = new Room(3, false, 129, false);
        Reservations reservation = new Reservations("king", false, 1);

        Employee employee = new Employee(12003,
                40, 12.40f, "Backend Engineer", "Nick Patton");

        System.out.printf("Employee Info: %s | Total Pay: $%.2f%n", employee.getOvertimeHours(), employee.getTotalPay());
        System.out.println("Reservation total: " + reservation.getReservationTotal());
        System.out.println(room.isAvailable());
    }

}
