// Chris Smith - S1564427

package com.bit235.wiki.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

// Service class handles login logic
@Service
public class LoginService {

    // hardcoded acceptable username and password
    private static final String USER = "chris";
    private static final String PWD = "123";

    // returns true if username AND password match hardcoded strings
    public boolean validateUser(String username, String password) {
        // compares the username and password provided by the input parameters to the hardcoded values
        return USER.equals(username) && PWD.equals(password);
    }

    // formats the success message
    public String getWelcomeMessage(String username) {
        return String.format("Welcome, %s!", StringUtils.capitalize(username));
    }
}
