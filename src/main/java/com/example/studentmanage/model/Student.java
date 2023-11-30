package com.example.studentmanage.model;


public class Student {
    private int id;
    private String studentName;
    private String studentSex;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", studentName='" + studentName + '\'' + ", studentSex=" + studentSex + '}';
    }
}
