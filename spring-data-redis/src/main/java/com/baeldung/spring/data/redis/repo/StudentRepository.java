package com.nklkarthi.spring.data.redis.repo;

import com.nklkarthi.spring.data.redis.model.Student;

import java.util.Map;

public interface StudentRepository {

    void saveStudent(Student person);

    void updateStudent(Student student);

    Student findStudent(String id);

    Map<Object, Object> findAllStudents();

    void deleteStudent(String id);
}
