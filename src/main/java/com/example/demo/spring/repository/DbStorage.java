package com.example.demo.spring.repository;

import com.example.demo.spring.model.PersonEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class DbStorage implements Storage{
    private final PersonRepository personRepository;

    @Override
    public int save(String text) {
        var p = new PersonEntity(null, text);
        personRepository.save(p);
        return p.getId();
    }

    @Override
    public Optional<String> findById(int id) {
        return personRepository.findById(id)
                .map(PersonEntity::getName);
    }
}
