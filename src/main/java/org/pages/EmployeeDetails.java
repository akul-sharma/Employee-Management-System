package org.pages;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.components.Header;
import org.data.entities.Employee;
import org.services.EmployeeService;

public class EmployeeDetails {

    @Property
    private Employee employee;

    @Inject
    private EmployeeService employeeService;

//    @Component
//    private Header header;

    void onActivate(int empId){
        System.out.println("onActive working");
        employee=employeeService.getEmployeeById(empId);
    }


}
