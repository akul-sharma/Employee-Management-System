package org.pages;


import org.apache.tapestry5.EventConstants;
import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.beaneditor.Validate;
import org.apache.tapestry5.corelib.components.BeanEditForm;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.components.Header;
import org.services.LoginService;

import java.util.List;

public class Login {

    @Property
    @Validate("required")
    private String username;

    @Property
    @Validate("required")
    private String password;

    @Property
    private String loginError;

    @Inject
    private LoginService loginService;

    @InjectComponent
    private Form loginForm;

    @Component
    private Header header;

//    @Property
//    private boolean loginSuccessful;


    void onValidateFromLoginForm(){
//        System.out.println("in validation-");
//        System.out.println(username+" "+password);
//        System.out.println(loginService.isValidLogin(username, password));
        if (!loginService.isValidLogin(username, password)) {
            System.out.println("Error has occured");
           loginForm.recordError("Invalid username or password");

        }
    }

    Object onSuccess() {
        System.out.println("on success");
        System.out.println(username+" "+password);
//        loginSuccessful = true;
        return EmployeeList.class;
    }

//    void onFailure() {
//        System.out.println("on failure called");
//        loginSuccessful = false;
//    }

//    public boolean isLoginSuccessful() {
//        System.out.println("Checking for login message");
//        return loginSuccessful;
//    }



//    private boolean isValidLogin(String enteredUsername, String enteredPassword) {
//        // Dummy list of employees (replace this with your actual data source)
//        List<Employee> employees = employeeListPage.getEmployeesData();
//
//        // Check if entered credentials match any employee in the list
//        return employees.stream()
//                .anyMatch(employee -> employee.getUsername().equals(enteredUsername)
//                        && employee.getPassword().equals(enteredPassword));
//    }
}
