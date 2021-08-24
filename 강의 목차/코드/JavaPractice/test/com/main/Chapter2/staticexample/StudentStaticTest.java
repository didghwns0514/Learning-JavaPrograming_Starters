package com.main.Chapter2.staticexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StudentStaticTest {
//    StudentStatic studentStatic;
//
//    @BeforeEach
//    void setUp() {
//        studentStatic = new StudentStatic();
//    }
//
//    @Test
//    @DisplayName("인스턴스 변수 테스트")
//    void instanceVariableTest() {
//        System.out.println("studentStatic.studentID = " + studentStatic.getStudentID());
//    }

    @Test
    @DisplayName("스태틱 클래스 변수 테스트")
    void staticVariableTest() {
        StudentStatic student1 = new StudentStatic("Student 1");
        StudentStatic student2 = new StudentStatic("Student 2");

        Assertions.assertEquals(student1.getStudentID() + 1, student2.getStudentID() );
    }
}