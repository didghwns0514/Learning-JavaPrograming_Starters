package com.main.Chapter2.reference.studentinfo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentInfoTest {

    StudentInfo testStudent;

    @BeforeEach
    void setUp() {
        testStudent = new StudentInfo(3, "HoJunYang");
        testStudent.setSubjectKorean("국어", 94);
        testStudent.setSubjectMath("기하벡터", 90);

    }


    @Test
    void showStudentTotalScore() {
        System.out.println("StudentInfoTest.showStudentTotalScore = " + testStudent.showStudentTotalScore());
        Assertions.assertEquals(testStudent.showStudentTotalScore(), 94
        + 90);
    }
}