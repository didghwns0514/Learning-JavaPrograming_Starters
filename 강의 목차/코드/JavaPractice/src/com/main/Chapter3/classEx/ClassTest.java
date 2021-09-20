package com.main.Chapter3.classEx;

public class ClassTest {

    public static void main(String[] args) {

        // 만약 외부 클래스를 가져오고, 원격으로 로딩할 때, 정보를 로컬에서 모르는 경우
        // 이를 reflection program 이라고 함
        Person person = new Person();

        // 1. 가져오는 방식 1
        Class pClass1 = person.getClass(); // getClass는 Object의 클래서 -> Class.class 반환
        // 2. 가져오는 방식 2
        Class pClass2 = Person.class;

        // 결과
        System.out.println("pClass1.getName() = " + pClass1.getName());
        System.out.println("pClass2.getName() = " + pClass2.getName());

        // 3. 가져오는 방식 3
        // 1, 2 번은 정적 로딩, Static Loading : 컴파일 시점에 이미 binding이 다 일어남
        // 1,2 번은 이미 Person 클래스에 대해서 알고 있는 것이지만, 3번은 존재하는 클래스를 동적으로 로딩함(해당 코드가 불리는 시점에 평가)
        try {
            Class pClass3 = Class.forName("com.main.Chapter3.classEx.Person"); // 없는 클래스이면 하위 에러가 뜸!
            System.out.println("pClass3.getName() = " + pClass3.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
