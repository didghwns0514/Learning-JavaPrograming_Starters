package com.main.Chapter4.collectionEx.arraylist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackExTest {
    StackEx stackEx;

    @BeforeEach
    void setUp() {
        stackEx = new StackEx();
        stackEx.push("Hi1");
        stackEx.push("Hi2");
        stackEx.push("Hi3");
    }

    @Test
    void push() {

        stackEx.showAll();
        stackEx.push("Push Example");
        stackEx.showAll();
    }

    @Test
    void pop() {
        stackEx.showAll();
        stackEx.pop();
        stackEx.showAll();
    }
}