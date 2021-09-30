package com.main.Chapter4.collectionEx.arraylist;

import java.util.ArrayList;

public class StackEx {

    private ArrayList<String> arrayStack;

    public StackEx() {
        this.arrayStack = new ArrayList<String>();
    }

    public void push(String data) {
        this.arrayStack.add(data);
    }

    public String pop() {
        if (!this.arrayStack.isEmpty()) { //underflow 방지
            String popData = this.arrayStack.remove(this.arrayStack.size() - 1);
            return popData;
        } else {
            System.out.println("No items exist!");
            return null;
        }
    }

    public void showAll() {
        for (String s : arrayStack) {
            System.out.println("s = " + s);
        }
        System.out.println("arrayStack = " + arrayStack);
    }
}

