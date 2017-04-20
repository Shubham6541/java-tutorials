package com.nklkarthi.spring.data.gemfire.repository;

import com.nklkarthi.spring.data.gemfire.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {

    Employee findByName(String name);

    Iterable<Employee> findBySalaryGreaterThan(double salary);

    Iterable<Employee> findBySalaryLessThan(double salary);

    Iterable<Employee> findBySalaryGreaterThanAndSalaryLessThan(double salary1, double salary2);
}
