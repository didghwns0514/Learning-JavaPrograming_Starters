package com.main.Chapter2.inheritance.refactorcustomer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomerTest {

    @Test
    void customerTest() {

        ArrayList<Customer> customerArrayList = new ArrayList<Customer>();

        Customer customerNormal1 = new Customer(10010, "이순신1");
        Customer customerNormal2 = new Customer(10011, "이순신2");
        VIPCustomer customerVIP1 = new VIPCustomer(10012, "이순신3", 1001);
        VIPCustomer customerVIP2 = new VIPCustomer(10013, "이순신4", 1002);
        GoldCustomer customerGOLD1 = new GoldCustomer(10014, "이순신5");

        customerArrayList.add(customerNormal1);
        customerArrayList.add(customerNormal2);
        customerArrayList.add(customerVIP1);
        customerArrayList.add(customerVIP2);
        customerArrayList.add(customerGOLD1);

        System.out.println("========== 고객정보 출력 ==========");
        for (Customer customer : customerArrayList) {
            System.out.println("customer = " + customer.showCustomerInfo());
        }

        System.out.println("==== 할인율과 보너스 포인트 결과 ====");
        int payedPrice = 10000;
        for (Customer customer : customerArrayList) {
            int cost = customer.calculatePrice(payedPrice);
            System.out.println("customer.getCustomerName() = " + customer.getCustomerName());
            System.out.println("customer.showCustomerInfo() = " + customer.showCustomerInfo());
        }

    }
}
