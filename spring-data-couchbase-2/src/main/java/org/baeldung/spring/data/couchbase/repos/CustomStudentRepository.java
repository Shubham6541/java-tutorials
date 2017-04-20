package org.nklkarthi.spring.data.couchbase.repos;

import java.util.List;

import org.nklkarthi.spring.data.couchbase.model.Student;

public interface CustomStudentRepository {
    List<Student> findByFirstNameStartsWith(String s);
}
