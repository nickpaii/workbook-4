package com.pluralsight;

public class Employee {
    
    private String employeeID;
    private String name;
    private String department;
    private float payRate;
    private float hoursWorked;

    public Employee(String employeeID, float hoursWorked, float payRate, String department, String name) {
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
}
