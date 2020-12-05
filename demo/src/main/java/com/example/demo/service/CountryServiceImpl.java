package com.example.demo.service;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Country create(Country country){
        return countryRepository.save(country);
    }

    @Override
    public List<Country> readAll(){
        return countryRepository.findAll();
    }

    @Override
    public Optional<Country> readOne(Integer id){
        return countryRepository.findById(id);
    }

    @Override
    public Country update(Country country) {
        Optional<Country> optional = countryRepository.findById(country.getId());
        if(optional.isPresent()){
            return countryRepository.save(country);
        }
        else{
            return null;
        }
    }

    @Override
    public Country delete(Integer id){
        Optional<Country> optional = countryRepository.findById(id);
        if(optional.isPresent()){
            countryRepository.delete(optional.get());
            return optional.get();
        }
        else{
            return null;
        }
    }
}
