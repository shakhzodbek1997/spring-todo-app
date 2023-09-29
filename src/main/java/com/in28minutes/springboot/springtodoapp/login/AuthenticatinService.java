package com.in28minutes.springboot.springtodoapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticatinService {
    public boolean authenticate(String userName, String password){
        boolean isValidUserName = userName.equalsIgnoreCase("maria");
        boolean isValidPassword = password.equalsIgnoreCase("2001");

        return isValidPassword && isValidUserName;
    }
}
