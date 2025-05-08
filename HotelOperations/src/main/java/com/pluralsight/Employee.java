package com.pluralsight;

public class Employee {
    
    private int employeeID;
    private String name;
    private String department;
    private float payRate;
    private float hoursWorked;
    private double startTime;

    public Employee(int employeeID, float hoursWorked, float payRate, String department, String name) {
        this.employeeID = employeeID;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
        this.department = department;
        this.name = name;
    }
    
    public float getTotalPay() {
        return payRate * hoursWorked;
    }
    
    public float getRegularHours() {
        return hoursWorked;
    }
    
    public float getOvertimeHours() {
        float overtimeHours = 0;
        
        if (hoursWorked > 40) {
            hoursWorked = overtimeHours;
        }
        
        return overtimeHours;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public float getPayRate() {
        return payRate;
    }

    public double punchIn(double time) {
        startTime = time;
        return startTime;
    }

    public double punchOut(double time) {

        double totalHoursWorked = 0;

        double timeWorked = time - startTime;

        totalHoursWorked += timeWorked;

        return totalHoursWorked;
    }
}
