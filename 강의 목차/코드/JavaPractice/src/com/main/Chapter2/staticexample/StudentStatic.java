package com.main.Chapter2.staticexample;

public class StudentStatic {
    private int studentID;
    String studentName;
    private static int studentIDStatic = 1000;

    public StudentStatic() {

        this("Dummy Student");
    }
    public StudentStatic(String studentName){
        this.studentName = studentName;
        System.out.println("studentIDStatic Before = " + StudentStatic.studentIDStatic);
        StudentStatic.studentIDStatic += 1;
        System.out.println("studentIDStatic After = " + StudentStatic.studentIDStatic);
        this.setStudentID();
    }

    public void setStudentID() {
        System.out.println("studentID Before = " + studentID);
        this.studentID = StudentStatic.studentIDStatic;
        System.out.println("studentID After = " + studentID);
    }

    public int getStudentID() {
        return studentID;
    }
}
