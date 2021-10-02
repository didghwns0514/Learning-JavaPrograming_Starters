package com.main.Chapter4.exceptionEx;

import org.jetbrains.annotations.Nullable;

public class ArrayExceptionTest {

    public static @Nullable
    Object main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        try {
            for (int i = 0; i < arr.length + 1; i++) {
                System.out.println("arr = " + arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("e = " + e);
            return null;
        } finally {
            System.out.println("ArrayExceptionTest.main : finally");
        }

        System.out.println("try-catch-finally escaped!");
        return null;
    }
}
