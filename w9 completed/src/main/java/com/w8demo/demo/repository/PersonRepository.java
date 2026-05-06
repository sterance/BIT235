package com.w8demo.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.w8demo.demo.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByUsernameAndPassword(String username, String password);
}
