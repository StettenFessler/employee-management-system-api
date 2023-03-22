package com.stettenfessler.employeesystemapi.services;

import com.stettenfessler.employeesystemapi.entity.EmployeeEntity;
import com.stettenfessler.employeesystemapi.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import com.stettenfessler.employeesystemapi.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // convert passed employee to employee entity to save it to the db
    @Override
    public Employee createEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employee, employeeEntity); // copy passed employee to employeeEntity
        employeeRepository.save(employeeEntity);
        return employee;
    }
}
