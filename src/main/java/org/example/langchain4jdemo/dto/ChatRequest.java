package org.example.langchain4jdemo.dto;

public record ChatRequest(
    String prompt,
    Integer userId
) {
}
