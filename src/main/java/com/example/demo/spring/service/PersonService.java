package com.example.demo.spring.service;

import com.example.demo.spring.model.Person;
import com.example.demo.spring.dto.Result;

public interface PersonService {
    int save(Person person);
    Result getbyId(int id);
}
