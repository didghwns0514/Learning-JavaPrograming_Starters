package com.main.Chapter2.array;

public class ArrayIntString {
    public static void main(String[] args) {

        char[] alphabets = new char[26];
        char ch = 'A';

        // OR for (int i = 0; i < alphabets.length; i++, ch++)
        for (int i = 0; i < alphabets.length; i++) {
//            alphabets[i] = (char) ((char)(int) ch + i);
            alphabets[i] = (char) (ch + i); // 자동 형변환 수행
        }

        for (char alphabet : alphabets) {
            System.out.println("alphabet = " + alphabet);
        }
    }
}
