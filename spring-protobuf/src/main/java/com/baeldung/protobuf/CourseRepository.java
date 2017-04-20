package com.nklkarthi.protobuf;

import com.nklkarthi.protobuf.nklkarthiTraining.Course;

import java.util.Map;

public class CourseRepository {

    private final Map<Integer, Course> courses;

    public CourseRepository(Map<Integer, Course> courses) {
        this.courses = courses;
    }

    public Course getCourse(int id) {
        return courses.get(id);
    }
}
