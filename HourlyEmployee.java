package com.milewskiarkadiuszmodul8.asmilewskiModul11;

public class HourlyEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    private double overtimeRate;

    public HourlyEmployee(String name, int birthYear, int hoursWorked, double hourlyRate, double overtimeRate) {
        super(name, birthYear, 2000.0);
        

    }
}
