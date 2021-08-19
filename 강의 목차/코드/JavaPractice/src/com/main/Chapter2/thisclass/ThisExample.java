package com.main.Chapter2.thisclass;

class BirthDayLocal{
    int day;
    int month;
    int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printLocalThis() {
        System.out.println(this);
    }
}

public class ThisExample {
    public static void main(String[] args) {

        BirthDayLocal b1 = new BirthDayLocal();
        BirthDayLocal b2 = new BirthDayLocal();

        System.out.println(b1);
        b1.printLocalThis();
        System.out.println(b2);
        b2.printLocalThis();

    }
}
