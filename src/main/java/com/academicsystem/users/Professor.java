package com.academicsystem.users;

public class Professor extends User {

    public Professor(String name, String id) {
        super(name, id);
    }

    @Override
    public void performAction() {
        System.out.println("Professor is creating a course.");
    }
}