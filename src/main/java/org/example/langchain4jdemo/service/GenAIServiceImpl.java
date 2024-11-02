package org.example.langchain4jdemo.service;

import lombok.RequiredArgsConstructor;
import org.example.langchain4jdemo.dto.ChatRequest;
import org.example.langchain4jdemo.model.BookModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenAIServiceImpl implements GenAIService {

    private final Assistant assistant;

    @Override
    public String getChatResponse(ChatRequest request) {
      return assistant.chat(request.userId(), request.prompt());
    }

    @Override
    public BookModel extractBookInfoFromText(String prompt) {
        List<String> popularGenres = List.of(
                "Fantasy",
                "Science Fiction",
                "Mystery",
                "Thriller",
                "Romance",
                "Horror",
                "Historical Fiction",
                "Young Adult",
                "Non-Fiction",
                "Dystopian"
        );
        return assistant.extractBookFromText(prompt, popularGenres);
    }
}