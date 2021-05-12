package com.Lamar.Chapter10;

import java.util.concurrent.Callable;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("John Lennon");
        course1.addStudent("Ringo Star");
        course1.addStudent("Paul McCartney");
        course1.addStudent("George Harrison");
        course1.addStudent("Pete Best");
        course1.addStudent("Clarence");

        course2.addStudent("Davey Jones");
        course2.addStudent("Peter Tork");
        course2.addStudent("Mike Nesmith");
        course2.addStudent("Mickey Doleanz");

        System.out.println("Number of students in course 1: " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i =0; i < course1.getNumberOfStudents(); i++)
            System.out.println(students[i] + " ,");

        System.out.println();
        System.out.println("Number of Students in course2: " + course2.getNumberOfStudents());
        String[] students2 = course2.getStudents();
        for (int i =0; i < course2.getNumberOfStudents(); i++)
            System.out.println(students2[i] + " ,");
//        course2.dropStudent("Davey Jones");

//        String[] students = course2.getStudents();
//        for (int i =0; i < course1.getNumberOfStudents(); i++)
//            System.out.println(students[i] + " ,");

    }
}
