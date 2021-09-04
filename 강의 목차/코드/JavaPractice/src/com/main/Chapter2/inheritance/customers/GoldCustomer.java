package com.main.Chapter2.inheritance.customers;

public class GoldCustomer extends Customer{

    public GoldCustomer() {
        bonusRatio = 0.05;

    }

    @Override
    public int calculatePrice(int price) {
        return super.calculatePrice(price);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}
