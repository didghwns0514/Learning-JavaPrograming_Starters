package com.main.Chapter2.thisclass;

class Person{
    String name;
    int age;

    public Person() {
        this("이름 없음", 1); // Dummy 등 initalizer 생성자 param 세팅 값이 모자라는 경우 등에 응용하여 사용가능
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class CallAnotherConst {

    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("p1.name = " + p1.name);
    }
}
