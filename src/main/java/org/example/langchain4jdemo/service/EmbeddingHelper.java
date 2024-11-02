package org.example.langchain4jdemo.service;

import dev.langchain4j.data.document.Document;
import dev.langchain4j.data.document.parser.apache.pdfbox.ApachePdfBoxDocumentParser;
import dev.langchain4j.data.document.splitter.DocumentSplitters;
import dev.langchain4j.model.embedding.EmbeddingModel;
import dev.langchain4j.store.embedding.EmbeddingStore;
import dev.langchain4j.store.embedding.EmbeddingStoreIngestor;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import static dev.langchain4j.data.document.loader.FileSystemDocumentLoader.loadDocument;

@Component
@RequiredArgsConstructor
public class EmbeddingHelper {

    private final EmbeddingModel embeddingModel;
    private final EmbeddingStore embeddingStore;

    @PostConstruct
    public void loadSingleDocument(){                                     // we can make an API to take the document we want to chat with
        String currentDirectory = System.getProperty("user.dir");
        String fileName = "/Mohamed_Gad_Resume.pdf";

        Document document = loadDocument(currentDirectory + fileName, new ApachePdfBoxDocumentParser());

        EmbeddingStoreIngestor embeddingStoreIngestor = EmbeddingStoreIngestor.builder()
                .documentSplitter(DocumentSplitters.recursive(400, 10)) // we split the document into chunks of 400 words
                .embeddingModel(embeddingModel) // then we choose an embedding model to embed the chunks
                .embeddingStore(embeddingStore) // then we choose an embedding store to store the embeddings
                .build();

        embeddingStoreIngestor.ingest(document);
    }
}
