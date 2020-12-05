package com.example.demo.service;

import com.example.demo.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    Country create(Country country);

    List<Country> readAll();

    Optional<Country> readOne(Integer id);

    Country update(Country country);

    Country delete(Integer id);
}
