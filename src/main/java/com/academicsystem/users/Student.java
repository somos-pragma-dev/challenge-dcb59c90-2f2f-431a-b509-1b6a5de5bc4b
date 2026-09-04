package com.academicsystem.users;

public class Student extends User {

    public Student(String name, String id) {
        super(name, id);
    }

    @Override
    public void performAction() {
        System.out.println("Student is enrolling in a course.");
    }
}