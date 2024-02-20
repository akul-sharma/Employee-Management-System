package org.services;

public interface LoginService {
    boolean isValidLogin(String enteredUsername, String enteredPassword);
}
