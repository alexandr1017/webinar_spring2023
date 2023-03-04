package com.example.demo.spring.controller;

import com.example.demo.spring.dto.Result;
import com.example.demo.spring.model.Person;
import com.example.demo.spring.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/persons")
public class PersonController {
    private final PersonService personService;

    @PostMapping("/")
    public int create(Person person){
        return personService.save(person);
    }
    
    @GetMapping("/{id}")
    public Result getById(@PathVariable int id){
       return personService.getbyId(id);
    }
}
