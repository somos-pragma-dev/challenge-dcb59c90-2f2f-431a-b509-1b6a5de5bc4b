package com.academicsystem;

import com.academicsystem.users.Administrator;
import com.academicsystem.users.Professor;
import com.academicsystem.users.Student;
import com.academicsystem.users.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UsersTest {

    @Test
    public void testUserEncapsulation() {
        User user = new Student("John Doe", "12345");
        Assertions.assertEquals("John Doe", user.getName());
        Assertions.assertEquals("12345", user.getId());
    }

    @Test
    public void testStudentAction() {
        Student student = new Student("Jane Doe", "67890");
        student.performAction();
    }

    @Test
    public void testProfessorAction() {
        Professor professor = new Professor("Dr. Smith", "54321");
        professor.performAction();
    }

    @Test
    public void testAdministratorAction() {
        Administrator administrator = new Administrator("Admin", "00000");
        administrator.performAction();
    }
}