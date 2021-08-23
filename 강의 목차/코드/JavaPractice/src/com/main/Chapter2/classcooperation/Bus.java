package com.main.Chapter2.classcooperation;

public class Bus implements Vehicle{

    private int busIdentificationNumber;
    private int passengerNumber;
    private int incomeToday;

    public Bus(int busIdentificationNumber, int passengerNumber, int incomeToday) {
        this.busIdentificationNumber = busIdentificationNumber;
        this.passengerNumber = passengerNumber;
        this.incomeToday = incomeToday;
    }

    public Bus(int busIdentificationNumber) {
        this.busIdentificationNumber = busIdentificationNumber;
    }

    public int getBusIdentificationNumber() {
        return busIdentificationNumber;
    }

    public void setBusIdentificationNumber(int busIdentificationNumber) {
        this.busIdentificationNumber = busIdentificationNumber;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public int getIncomeToday() {
        return incomeToday;
    }

    public void setIncomeToday(int incomeToday) {
        this.incomeToday = incomeToday;
    }

    @Override
    public void printVehicle() {
        System.out.println("This is Bus! Number = " + busIdentificationNumber);
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
        this.incomeToday += FeeTable.BUS_FEE.getFee();
        System.out.println("incomeToday After = " + incomeToday);
    }
}
