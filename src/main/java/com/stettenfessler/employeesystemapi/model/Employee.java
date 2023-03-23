package com.stettenfessler.employeesystemapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// interacts with the UI
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private long id; // primary key
    private String firstName;
    private String lastName;
    private String emailId;
}
