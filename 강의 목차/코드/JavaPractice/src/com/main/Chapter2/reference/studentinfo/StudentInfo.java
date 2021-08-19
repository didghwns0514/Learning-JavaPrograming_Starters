package com.main.Chapter2.reference.studentinfo;

public class StudentInfo {
    int studentID;
    String studentName;

    Subject korean;
    Subject math;

    public StudentInfo(int studentID, String studentName) {

        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void setSubjectKorean(String subjectName, int subjectScore) {
        this.korean = new Subject(subjectName, subjectScore);
    }

    public void setSubjectMath(String subjectName, int subjectScore) {
        this.math = new Subject(subjectName, subjectScore);
    }

    public int showStudentTotalScore() {
        return korean.getSubjectScore() + math.getSubjectScore();
    }
}
