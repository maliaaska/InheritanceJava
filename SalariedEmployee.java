package com.milewskiarkadiuszmodul8.asmilewskiModul11;

public class SalariedEmployee extends Employee {
    private double bonus;

    public SalariedEmployee(String name, int birthYear, double bonus) {
        super(name, birthYear, 3000.0);

    }

    public double addBonus( double additionalBonus) {
        return this.bonus + additionalBonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculatePay() {
        return getBaseSalary() + bonus;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "bonus=" + bonus +
                '}';
    }


}

