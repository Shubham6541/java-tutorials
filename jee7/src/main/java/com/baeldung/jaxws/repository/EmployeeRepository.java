package com.nklkarthi.jaxws.repository;

import java.util.List;

import com.nklkarthi.jaxws.exception.EmployeeAlreadyExists;
import com.nklkarthi.jaxws.exception.EmployeeNotFound;
import com.nklkarthi.jaxws.model.Employee;

public interface EmployeeRepository {

    List<Employee> getAllEmployees();

    Employee getEmployee(int id) throws EmployeeNotFound;

    Employee updateEmployee(int id, String name) throws EmployeeNotFound;

    boolean deleteEmployee(int id) throws EmployeeNotFound;

    Employee addEmployee(int id, String name) throws EmployeeAlreadyExists;

    int count();
}
