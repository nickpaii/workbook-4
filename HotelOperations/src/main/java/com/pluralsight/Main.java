package com.pluralsight;

public class Main {


    public static void main(String[] args) {

        Room room = new Room(3, false, 129, false);
        Reservations reservation = new Reservations("double", false, 1);

        Employee employee = new Employee(12003,
                40, 12.40f, "Backend Engineer", "Nick Patton");

        System.out.printf("Employee ID: %d | Hours Worked: %.2f | Pay Rate: $%.2f | Department: %s | Employee Name: %s%n",
                employee.getEmployeeID(), employee.getRegularHours(), employee.getPayRate(),
                employee.getDepartment(), employee.getName());

        System.out.println(employee.punchIn(10));
        System.out.println(employee.punchOut(14.75));
        System.out.printf("Reservation total: $%.2f%n", reservation.getReservationTotal());
        System.out.println(room.isAvailable());
    }

}
