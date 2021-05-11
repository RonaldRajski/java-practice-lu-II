package com.Lamar.Chapter10;


//Course
//        -courseName: String
//        -students: String[]
//        -numberOfStudents: int
//        +Course(courseName: String)
//        +getCourseName(): String
//        +addStudent(student: String): void
//        +dropStudent(student: String): void
//        +getStudents(): String[]
//        +getNumberOfStudents(): int

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents]= student;
        numberOfStudents++;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void dropStudent(String Student) {
    }
}
