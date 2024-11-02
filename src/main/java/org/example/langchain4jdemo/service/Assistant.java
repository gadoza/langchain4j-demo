package org.example.langchain4jdemo.service;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import org.example.langchain4jdemo.model.BookModel;

import java.util.List;

public interface Assistant {

    @SystemMessage("""
            You are a helpful assistant. Try to respond in a fair and warm manner.
            If you don't know answer, just tell it.
            """)
    String chat (@MemoryId int memoryId, @UserMessage String prompt);


    @SystemMessage("extract book information from the text and genre should be from this list {{genres}} and return in json format")
    BookModel extractBookFromText(@UserMessage String text, @V("genres") List<String> genres);
}
