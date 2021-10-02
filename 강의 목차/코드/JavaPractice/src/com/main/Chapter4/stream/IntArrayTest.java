package com.main.Chapter4.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

    public static void main(String[] args) {

        // array 기준
        int[] arr = {1, 2, 3, 4, 5};
        //        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        //        int[] arr2 = new int[5];
        //        arr2[0] = 1;
        //        arr2[1] = 2;


        // 기본 Stream
        IntStream intStream = Arrays.stream(arr);
        int sumed = Arrays.stream(arr).sum();
        int count = (int) Arrays.stream(arr).count(); // 새로 Arrays.stream 메서드를 호출해야 소비된 Stream 말고, 새로 생성된 Stream 사용 가능
        System.out.println("sumed = " + sumed);
        System.out.println("count = " + count);

    }
}
