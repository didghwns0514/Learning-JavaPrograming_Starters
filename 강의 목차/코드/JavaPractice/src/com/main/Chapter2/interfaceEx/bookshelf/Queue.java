package com.main.Chapter2.interfaceEx.bookshelf;

public interface Queue {

    void enQueue(String title);

    String deQueue();

    int getBooksSize();
}
