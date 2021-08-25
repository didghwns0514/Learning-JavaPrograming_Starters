package com.main.Chapter2.array;

public class ArrayTestInt {



    public static void main(String[] args) {
        // new는 반드시 넣어야 함
        int[] array1 = new int[10]; // 10개짜리, 40byte
        int[] array2 = new int[] {0, 1, 2};
        int[] array3 = {4, 5, 6};
        //int

        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[7] = 7;

        // for(int i = 0; i++; i < array1.length)
        for (int i = 0; i < array1.length; i++) {
            System.out.println("array1[i] = " + array1[i]);
        }


    }


}
