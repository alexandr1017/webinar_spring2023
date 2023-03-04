package com.example.demo.spring.repository;

import com.example.demo.spring.service.Counter;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class MapStorage implements Storage{

    public final Map<Integer, String> vault=
            new HashMap<>();
    public final Counter counter;

    public MapStorage(Counter counter) {
        this.counter = counter;
    }

    @Override
    public int save(String text) {
        var nextId = counter.next();
        vault.put(nextId, text);
        return nextId;
    }

    @Override
    public Optional<String> findById(int id) {
        return Optional.ofNullable(vault.get(id));
    }
}
