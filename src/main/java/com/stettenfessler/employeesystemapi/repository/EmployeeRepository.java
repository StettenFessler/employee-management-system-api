package com.stettenfessler.employeesystemapi.repository;

import com.stettenfessler.employeesystemapi.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// interacts with db to store data
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
