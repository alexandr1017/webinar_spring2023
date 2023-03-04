package com.example.demo.spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public record SettingsCounter(
        @Value("${counter.step}") int step,
        @Value("${counter.initialValue}") int initialValue) {
}
