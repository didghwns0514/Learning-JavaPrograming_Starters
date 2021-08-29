package com.main.Chapter2.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListStudentTest {

    ListStudent listStudent = new ListStudent(123, "호준");

    @Test
    void addSubjects() {
        listStudent.addSubject("Java", 100);
        listStudent.addSubject("Python", 200);

        listStudent.showStudentInfo();

    }

}