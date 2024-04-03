package com.milewskiarkadiuszmodul8.asmilewskiModul11;

public class Employee extends Person {
    private double baseSalary;
    private long employeeId;

    private static long nextEmployeeId = 1;
    public Employee(String name, int birthYear, double baseSalary) {
        super(name, birthYear);
        ++nextEmployeeId;
    }

    public double calculatePay() {
        return baseSalary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getEmployeeId() {
        return getEmployeeId();
    }

    @Override
    public String toString() {
        return super.toString() + " Employee{" +
                "baseSalary=" + getBaseSalary() +
                ", employeeId=" + this.employeeId +
                '}';
    }
}
