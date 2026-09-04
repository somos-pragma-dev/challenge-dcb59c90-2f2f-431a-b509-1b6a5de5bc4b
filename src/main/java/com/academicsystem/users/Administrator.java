package com.academicsystem.users;

public class Administrator extends User {

    public Administrator(String name, String id) {
        super(name, id);
    }

    @Override
    public void performAction() {
        System.out.println("Administrator is managing users and courses.");
    }
}