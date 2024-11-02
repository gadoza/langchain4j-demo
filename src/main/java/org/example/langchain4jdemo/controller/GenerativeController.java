package org.example.langchain4jdemo.controller;

import lombok.RequiredArgsConstructor;
import org.example.langchain4jdemo.dto.ChatRequest;
import org.example.langchain4jdemo.dto.ChatResponse;
import org.example.langchain4jdemo.model.BookModel;
import org.example.langchain4jdemo.service.GenAIService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generative")
@RequiredArgsConstructor
public class GenerativeController {

    private final GenAIService genAiService;

    @PostMapping
    public ChatResponse getChatResponse(@RequestBody ChatRequest chatRequest) {
        return new ChatResponse(genAiService.getChatResponse(chatRequest));
    }

    @PostMapping("/book")
    public BookModel extractBookInfoFromText(@RequestBody ChatRequest chatRequest){
        return genAiService.extractBookInfoFromText(chatRequest.prompt());
    }
}
