package com.main.Chapter2.List;

import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("AAA");
        arrayList.add("BBB");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("arrayList = " + arrayList.get(i));
        }

    }

}
