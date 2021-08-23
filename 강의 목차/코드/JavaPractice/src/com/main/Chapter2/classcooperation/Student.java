package com.main.Chapter2.classcooperation;

public class Student {

    private String name;
    private int classYear;
    private int money;

    public Student(String name, int classYear, int money) {
        this.name = name;
        this.classYear = classYear;
        this.money = money;
    }

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassYear() {
        return classYear;
    }

    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void takeBus(Bus bus){
        bus.takePassenger();
        money -= FeeTable.BUS_FEE.getFee();
    }

    public void takeSubway(Subway subway) {
        subway.takePassenger();
        money -= FeeTable.SUBWAY_FEE.getFee();
    }
}
