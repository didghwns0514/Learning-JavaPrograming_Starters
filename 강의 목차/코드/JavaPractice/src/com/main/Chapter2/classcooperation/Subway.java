package com.main.Chapter2.classcooperation;

public class Subway implements Vehicle {
    private int roadIdentificationNumber;
    private int passengerNumber;
    private int incomeToday;

    public Subway(int roadIdentificationNumber, int passengerNumber, int incomeToday) {
        this.roadIdentificationNumber = roadIdentificationNumber;
        this.passengerNumber = passengerNumber;
        this.incomeToday = incomeToday;
    }

    public int getRoadIdentificationNumber() {
        return roadIdentificationNumber;
    }

    public void setRoadIdentificationNumber(int roadIdentificationNumber) {
        this.roadIdentificationNumber = roadIdentificationNumber;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public int getTodayIncome() {
        return incomeToday;
    }

    public void setTodayIncome(int todayIncome) {
        this.incomeToday = todayIncome;
    }

    @Override
    public void printVehicle() {
        System.out.println("This is Subway! Number = " + roadIdentificationNumber);
    }

    @Override
    public void takePassenger() {
        this.printVehicle();
        this.passengerNumberUpdate();
        this.todayIncomeUpdate();
    }

    @Override
    public void passengerNumberUpdate() {
        System.out.println("passengerNumber Before = " + passengerNumber);
        this.passengerNumber += 1;
        System.out.println("passengerNumber After = " + passengerNumber);
    }

    @Override
    public void todayIncomeUpdate() {
        System.out.println("incomeToday Before = " + incomeToday);
        this.incomeToday += FeeTable.SUBWAY_FEE.getFee();
        System.out.println("incomeToday After = " + incomeToday);
    }
}


