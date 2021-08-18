package com.main.Chapter2.classpart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student testStudent;

    @BeforeEach
    void beforeEach() {
        testStudent = new Student(1, "Yurim", 100, "105호");

    }

    @Test
    @DisplayName("객체 get 메서드 테스트")
    void showStudentInfo1(){

        Assertions.assertEquals(testStudent.getStudentName(), "Yurim");
    }

    @Test
    @DisplayName("객체 주소값 찍어보기")
    void getStudentInstanceAddress(){

        System.out.println(testStudent); //com.main.Chapter2.classpart.Student@35d019a3

    }
}