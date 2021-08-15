package com.main.Chapter2.classpart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student testStudent;

    @BeforeEach
    void beforeEach() {
        testStudent = new Student(1, "Yurim", 100, "105호");

    }

    @Test
    void showStudentInfo1(){
        Assertions.assertEquals(testStudent.showStudentInfo(), "Yurim");
    }


}