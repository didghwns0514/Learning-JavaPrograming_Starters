package com.main.Chapter2.List;

import com.main.Chapter2.reference.studentinfo.Subject;

import java.util.ArrayList;

public class ListStudent {
    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjects;

    public ListStudent(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjects = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject(name, score);
        subjects.add(subject);
    }

    public void showStudentInfo() {
        for (Subject subject : subjects) {
            System.out.println("subject.getSubjectName() = " + subject.getSubjectName());
            System.out.println("subject.getSubjectScore() = " + subject.getSubjectScore());

        }
    }

}
