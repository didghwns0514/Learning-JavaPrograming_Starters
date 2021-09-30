package com.main.Chapter4.collectionEx.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueExTest {
    QueueEx queueEx = new QueueEx();

    @BeforeEach
    void setUp() {
        queueEx.enQueue("Data1");
        queueEx.enQueue("Data2");
        queueEx.enQueue("Data3");
    }

    @Test
    void enQueue() {
        queueEx.showAll();
        queueEx.enQueue("enQueueData1");
        queueEx.showAll();
    }

    @Test
    void deQueue() {
        queueEx.showAll();
        String tmpDeque = queueEx.deQueue();
        queueEx.showAll();
        Assertions.assertEquals(tmpDeque, "Data1");
    }
}