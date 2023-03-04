package com.example.demo.spring.dto;

import java.util.List;

public record Result(boolean success, String response, List<String> errors) {
}
