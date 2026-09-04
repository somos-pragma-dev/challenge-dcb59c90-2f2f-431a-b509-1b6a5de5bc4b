package com.academicsystem;

import com.academicsystem.courses.Course;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoursesTest {

    @Test
    public void testCourseEncapsulation() {
        Course course = new Course("Math", "101");
        Assertions.assertEquals("Math", course.getName());
        Assertions.assertEquals("101", course.getId());
    }
}