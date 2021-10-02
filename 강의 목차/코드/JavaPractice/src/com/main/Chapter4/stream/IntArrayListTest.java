package com.main.Chapter4.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IntArrayListTest {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>(); // List가 ArrayList 보다 상위, 업캐스팅

        stringList.add("Item1");
        stringList.add("UareMyLove");
        stringList.add("Item2");
        stringList.add("isMyVariable1");
        stringList.add("Item3");


        // 1) Stream 으로 순회하기
        Stream<String> stream = stringList.stream();
        stream.forEach(s -> System.out.println("s = " + s)); // 최종 연산자, Stream 소비

        // Buffer에서 꺼내서 쓰기 때문에 소비가 되는듯, Cursor 처럼
        System.out.println("stringList.stream().count() = " + stringList.stream().count()); // 새 Stream 사용
        System.out.println("(long) stringList.size() = " + (long) stringList.size()); // 새 Stream 사용
        // 동일 구문, 순회하기
        for (String string : stringList) {
            System.out.println("string = " + string);
        }


        // 2) Stream으로 Sorting 하기
        // Chaining 처럼 사용 가능 -> 각 부분에서 익명함수 사용가능 -> return은 계속 Stream 타입으로 반환됨
        stringList.stream().sorted().forEach(s -> System.out.println("s = " + s));
        String[] toArray = stringList.stream().sorted().toArray(String[]::new);


    }


}
