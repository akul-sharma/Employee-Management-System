package org.services;

import org.data.entities.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    private List<Employee> employeeList;

    public EmployeeServiceImpl(){
        employeeList= Arrays.asList(
                new Employee(1, "John Doe", 30, "123 Main St", "abc", "123"),
                new Employee(2, "Jane Smith", 25, "456 Oak St", "efg", "456"),
                new Employee(3, "Bob Johnson", 35, "789 Pine St", "hij", "789"),
                new Employee(4, "Alice Williams", 28, "101 Cedar St", "klm", "101"),
                new Employee(5, "Charlie Brown", 32, "202 Birch St", "nop", "202"),
                new Employee(6, "Diana Martinez", 27, "303 Elm St", "qrs", "303"),
                new Employee(7, "Eddie Davis", 31, "404 Maple St", "tuv", "404"),
                new Employee(8, "Fiona Garcia", 29, "505 Walnut St", "wxy", "505"),
                new Employee(9, "George Wilson", 34, "606 Pine St", "zab", "606"),
                new Employee(10, "Helen Miller", 26, "707 Oak St", "cde", "707")
        );
    }

    @Override
    public Employee getEmployeeById(int empId) {
        for(Employee emp: employeeList){
            if(emp.getId()==empId){
                return emp;
            }
        }
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }
}
