package com.main.Chapter2.classpart;

public class Student {
    // String은 문자열 취급하기 위한 JDK에서 제공하는 API
    int studentID;
    String studentName;
    int grade;
    String address;

    public Student(int studentID, String studentName, int grade, String address) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.grade = grade;
        this.address = address;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName(){
        return studentName;
    }

    public static void main(String[] args) {
        Student studen_Lee = new Student(1, "Yang HoJun", 100, "146 Street");
        studen_Lee.getStudentName();
    }

}

    /*
    * if __name__=='__main__'
    * */
