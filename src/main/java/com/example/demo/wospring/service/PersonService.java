package com.example.demo.wospring.service;

import com.example.demo.wospring.dto.Result;
import com.example.demo.wospring.model.Person;

public interface PersonService {
    int save(Person person);
    Result getbyId(int id);
}
