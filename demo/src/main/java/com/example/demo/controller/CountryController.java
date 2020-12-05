package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/v2")
@CrossOrigin("http://localhost:4200/")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping
    public Country create(@RequestBody Country country){
        return countryService.create(country);
    }

    @GetMapping
    public List<Country> readAll(){
        return countryService.readAll();
    }

    @GetMapping("/{id}")
    public Optional<Country> readOne(@PathVariable Integer id){
        return countryService.readOne(id);
    }

    @PutMapping
    public Country update(@RequestBody Country country){
        return countryService.update(country);
    }

    @DeleteMapping("/{id}")
    public Country delete(@PathVariable Integer id){
        return countryService.delete(id);
    }
}