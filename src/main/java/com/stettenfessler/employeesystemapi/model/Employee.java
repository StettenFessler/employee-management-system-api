package com.stettenfessler.employeesystemapi.model;

import lombok.Data;

// interacts with the UI
@Data
public class Employee {
    private long id; // primary key
    private String firstName;
    private String lastName;
    private String emailId;
}
