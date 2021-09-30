package com.main.Chapter4.collectionEx.arraylist;

import java.util.ArrayList;

public class QueueEx {
    private ArrayList<String> arrayQueue = new ArrayList<>();

    public void enQueue(String data) {

        arrayQueue.add(data);
    }

    public String deQueue() {
        if (arrayQueue.isEmpty()) {
            return null;
        } else {
            return arrayQueue.remove(0);
        }
    }

    public void showAll() {
        for (String s : arrayQueue) {
            System.out.println("s = " + s);

        }
        System.out.println("arrayQueue = " + arrayQueue);
    }
}
