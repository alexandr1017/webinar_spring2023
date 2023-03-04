package com.example.demo.spring.service;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class AtomicCounter implements Counter {

    private final AtomicInteger atomicInteger;
    private final SettingsCounter settingsCounter;

    public AtomicCounter(SettingsCounter settingsCounter) {
        this.settingsCounter = settingsCounter;
        atomicInteger = new AtomicInteger(settingsCounter.initialValue());
    }

    @Override
    public int next() {
        return atomicInteger
                .addAndGet(settingsCounter.step());
    }
}
