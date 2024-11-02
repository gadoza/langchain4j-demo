package org.example.langchain4jdemo.model;

import dev.langchain4j.model.output.structured.Description;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BookModel {

    private Integer id;

    private String title;

    @Description("should be less than 20 words") // it's an annotation from langchain4j to add description on how to use this field
    private String description;

    private String genre;

    private String author;

    private LocalDate dateOfPublication;
}
