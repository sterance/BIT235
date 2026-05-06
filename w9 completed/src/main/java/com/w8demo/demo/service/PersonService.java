package com.w8demo.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.w8demo.demo.model.Person;
import com.w8demo.demo.repository.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public boolean isValidUser(String username, String password) {
        if (username == null || username.trim().isEmpty()) {
            return false;
        }

        if (password == null || password.isEmpty()) {
            return false;
        }

        return personRepository.findByUsernameAndPassword(username.trim(), password).isPresent();
    }

    public Person findByUsernameAndPassword(String username, String password) {

        if (username == null || username.trim().isEmpty()) {
            return null;
        }

        if (password == null || password.isEmpty()) {
            return null;
        }
        return personRepository
                .findByUsernameAndPassword(username.trim(), password)
                .orElse(null);
    }

}