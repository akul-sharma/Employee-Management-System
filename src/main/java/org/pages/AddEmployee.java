package org.pages;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SetupRender;
import org.apache.tapestry5.beaneditor.Validate;
import org.apache.tapestry5.corelib.components.Form;

public class AddEmployee {

    @Property
    @Validate("required")
    private int id;

    @Property
    @Validate("required")
    private String name;

    @Property
    @Validate("required")
    private int age;

    @Property
    @Validate("required")
    private String address;

    @Property
    @Validate("required")
    private String username;

    @Property
    @Validate("required")
    private String password;

    @Property
    @Validate("required")
    private String retypePassword;


    @InjectComponent("addEmployeeForm")
    private Form addEmployeeForm;

    void onValidateFromAddEmployeeForm() {
        if (id == 0 || age == 0 || name.isEmpty() || address.isEmpty() || username.isEmpty() || password.isEmpty() || retypePassword.isEmpty()) {
            addEmployeeForm.recordError("All fields are required.");
        }

        if (!password.equals(retypePassword)) {
            addEmployeeForm.recordError("Password and Retype Password must match.");
        }
    }

    void onSuccess() {
        System.out.println(id + " " + name + " " + age + " " + address + " " + username + " " + password);
        System.out.println("Successfully added");
    }
}
