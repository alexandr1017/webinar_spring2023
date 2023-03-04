package com.example.demo.spring.repository;

import java.util.Optional;

public interface Storage {

    int save(String text);
    Optional<String> findById(int id);
}
