package org.data.entities;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    private int id;
    private String name;
    private int age;
    private String address, username, password;

    // Sample constructor
    public Employee(int id, String name, int age, String address, String username, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.username=username;
        this.password=password;
    }

    // Getter and setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return String.valueOf(username);
    }

    // Additional method to represent the password
    public String getPassword() {
        return String.valueOf(password);
    }

    public boolean isValidCredentials(String enteredUsername, String enteredPassword) {
        return this.username.equals(enteredUsername) && this.password.equals(enteredPassword);
    }

}
