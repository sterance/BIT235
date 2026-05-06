package com.w8demo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.w8demo.demo.model.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
