package com.milewskiarkadiuszmodul8.asmilewskiModul11;

import java.time.Year;

public class Person {
    private String name;
    private int birthYear;

    public boolean yearCheck(int year) {
//        Year currentYear = thisYear;
        int length = Integer.parseInt(String.valueOf(String.valueOf(year).length()));
        if (year >= 1900 && year <= 2024 && length == 4) {
            System.out.println("the year is correct.");
        } return true;
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;

    }

//    Year thisYear = Year.now();
//
//    public void yearPrint() {
//        System.out.println(thisYear);
//    }


}