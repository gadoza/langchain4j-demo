package org.example.langchain4jdemo.service;

import org.example.langchain4jdemo.dto.ChatRequest;
import org.example.langchain4jdemo.model.BookModel;

public interface GenAIService {

    String getChatResponse(ChatRequest prompt);

    String getChatResponseWithRAG(ChatRequest prompt);

    BookModel extractBookInfoFromText(String prompt);
}
