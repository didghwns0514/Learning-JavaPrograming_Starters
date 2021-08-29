package com.main.Chapter2.array;

public class ObjectCopy {

    public static void main(String[] args) {
        Book[] bookArr1 = new Book[3];
        Book[] bookArr2 = new Book[3];

        bookArr1[0] = new Book("책1", "호준");
        bookArr1[1] = new Book("책2", "호준");
        bookArr1[2] = new Book("책3", "호준");

        for (int i = 0; i < bookArr1.length; i++) {
            System.out.println("i = " + i);
            System.out.println("bookArr1 = " + bookArr1[i]);
        }

//        Shallow copy - Heap의 주소가 복사되어 들어가는 것
        System.arraycopy(bookArr1,0,bookArr2, 0, 3);
        for (int i = 0; i < bookArr2.length; i++) {
            System.out.println("i = " + i);
            System.out.println("bookArr2 = " + bookArr1[i]);
        }

    }

}
