package com.main.Chapter3.objectEx;

class Student {

    private int studentID;
    private String studnetName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studnetName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            return this.studnetName == ((Student) obj).studnetName && this.studentID == ((Student) obj).studentID;
        } else {
            return false;
        }
    }
}


public class EqualsTest {

    public static void main(String[] args) {
        String str1 = new String("Hi");
        String str2 = new String("Bye");
        String str3 = new String("Bye");

        // (1) 메모리 끼리 비교
        System.out.println("str1 == str2 = " + str1 == str2);
        System.out.println("str2 == str3 = " + str2 == str3);

        // (2) 재정의 안하면 (1)과 동일, String의 경우 string 값을 비교하므로 True
        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("str2.equals(str3) = " + str2.equals(str3));

        Student st1 = new Student(1, "St_1");
        Student st2 = new Student(2, "St_2");
        Student st3 = new Student(2, "St_2");
        Student st4 = new Student(3, "St_2");

        System.out.println("st1.equals(st2) = " + st1.equals(st2));
        System.out.println("st2.equals(st3) = " + st2.equals(st3));
        System.out.println("st3.equals(st4) = " + st3.equals(st4));

    }
}
