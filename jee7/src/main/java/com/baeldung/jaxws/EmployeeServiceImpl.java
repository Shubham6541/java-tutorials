package com.nklkarthi.jaxws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.nklkarthi.jaxws.exception.EmployeeAlreadyExists;
import com.nklkarthi.jaxws.exception.EmployeeNotFound;
import com.nklkarthi.jaxws.model.Employee;
import com.nklkarthi.jaxws.repository.EmployeeRepository;

@WebService(serviceName = "EmployeeService", endpointInterface = "com.nklkarthi.jaxws.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Inject
    private EmployeeRepository employeeRepositoryImpl;

    @WebMethod
    public Employee getEmployee(int id) throws EmployeeNotFound {
        return employeeRepositoryImpl.getEmployee(id);
    }

    @WebMethod
    public Employee updateEmployee(int id, String name) throws EmployeeNotFound {
        return employeeRepositoryImpl.updateEmployee(id, name);
    }

    @WebMethod
    public boolean deleteEmployee(int id) throws EmployeeNotFound {
        return employeeRepositoryImpl.deleteEmployee(id);
    }

    @WebMethod
    public Employee addEmployee(int id, String name) throws EmployeeAlreadyExists {
        return employeeRepositoryImpl.addEmployee(id, name);
    }

    @WebMethod
    public int countEmployees() {
        return employeeRepositoryImpl.count();
    }

    @WebMethod
    public List<Employee> getAllEmployees() {
        return employeeRepositoryImpl.getAllEmployees();
    }
}
