package com.example.demo.wospring.repository;

import com.example.demo.wospring.service.Counter;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

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
