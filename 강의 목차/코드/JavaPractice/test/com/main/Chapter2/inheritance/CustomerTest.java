package com.main.Chapter2.inheritance;

import com.main.Chapter2.inheritance.customers.Customer;
import com.main.Chapter2.inheritance.customers.VIPCustomer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    void calculateCustomerNormalBonus() {

        Customer customerNormal = new Customer(10010, "호준");

        int returnPrice = customerNormal.calculatePrice(10000);
        Assertions.assertEquals(returnPrice, 10000);
        Assertions.assertEquals(customerNormal.getBonusPoint(), 100);

    }

    @Test
    void calculateVIPCustomerNormalBonus() {
        Customer customerVIP = new VIPCustomer(10011, "호준2");

        int returnPrice = customerVIP.calculatePrice(10000);
        Assertions.assertEquals(returnPrice, 9000);
        Assertions.assertEquals(customerVIP.getBonusPoint(), 500);
    }
}