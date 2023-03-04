package com.example.demo.wospring.service;

import com.example.demo.wospring.dto.Result;
import com.example.demo.wospring.model.Person;
import com.example.demo.wospring.repository.Storage;

import java.util.Collections;
import java.util.List;

public class PersonServiceImpl implements PersonService {

    public static final String NOT_FOUND_TEXT_ERROR = "не найдена запись с %d";
    private final Storage storage;

    public PersonServiceImpl(Storage storage) {
        this.storage = storage;
    }

    @Override
    public int save(Person person) {
        return storage.save(person.name());
    }

    @Override
    public Result getbyId(int id) {
        var name = storage.findById(id);

        return name.map(
                n -> new Result(true, n, Collections.emptyList())
        ).orElseGet(() ->
                new Result(false, null,
                        List.of(String.format(NOT_FOUND_TEXT_ERROR, id))));
    }
}
