package org.nklkarthi.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.nklkarthi.persistence.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
