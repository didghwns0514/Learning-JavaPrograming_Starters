package com.main.Chapter2.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void calculatePrice() {

        Customer customerNormal = new Customer(10010, "호준", 1000);
        Customer customerVIP = new VIPCustomer(10101, "kim");


    }
}