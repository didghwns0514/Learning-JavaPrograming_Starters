package com.main.Chapter2.inheritance.refactorcustomer;

public class GoldCustomer extends Customer {

    double saleRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "GOLD";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    @Override
    public int calculatePrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}
