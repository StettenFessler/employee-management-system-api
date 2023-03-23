package com.stettenfessler.employeesystemapi.services;

import com.stettenfessler.employeesystemapi.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
