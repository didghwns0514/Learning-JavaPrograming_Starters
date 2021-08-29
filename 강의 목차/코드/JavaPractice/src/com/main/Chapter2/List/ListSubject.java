package com.main.Chapter2.List;

public class ListSubject {


    private String subjectName;
    private int scorePoint;

    public ListSubject(String name) {
        this(name, 0);
    }

    public ListSubject(String name, int scorePoint) {
        this.subjectName = name;
        this.scorePoint = scorePoint;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getScorePoint() {
        return scorePoint;
    }

    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }
}
