package org.nklkarthi.web.dao;

import org.nklkarthi.web.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> 
{

}
