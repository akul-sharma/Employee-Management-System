package org.services;


import org.data.entities.Employee;

import java.util.List;

public interface EmployeeService {
    Employee getEmployeeById(int empId);

    List<Employee> getAllEmployees();
}
