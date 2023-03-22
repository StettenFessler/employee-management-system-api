package com.stettenfessler.employeesystemapi.entity;

import jakarta.persistence.*;
import lombok.Data;

// works with JPA to store data in database
@Entity
@Data
@Table(name = "employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generate id by automatically incrementing
    private long id; // primary key
    private String firstName;
    private String lastName;
    private String emailId;
}
