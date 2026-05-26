# LangChain4j RAG Demo

> A **Retrieval-Augmented Generation (RAG)** document Q&A assistant built with Java and [LangChain4j](https://github.com/langchain4j/langchain4j) — chat with your documents using LLM-driven semantic search.

## Overview

This project demonstrates how to build an AI-powered document chat system using Java. It leverages LangChain4j to implement a RAG pipeline that:
1. Loads and chunks documents from the file system
2. Generates vector embeddings for each chunk
3. Stores embeddings in a vector store for semantic retrieval
4. Uses an LLM to answer user questions grounded in the document context

## Features

- **RAG Pipeline** — Retrieval-Augmented Generation for accurate, document-grounded answers
- **Document Chat** — Ask natural language questions and get context-aware responses
- **LangChain4j Integration** — Leverages the LangChain4j Java framework for LLM orchestration
- **Pluggable LLM Backend** — Supports OpenAI-compatible APIs

## Tech Stack

| Technology | Purpose |
|---|---|
| Java | Core language |
| LangChain4j | LLM orchestration & RAG framework |
| Spring Boot | Application framework |
| Gradle | Build tool |

## Getting Started

### Prerequisites

- Java 17+
- Gradle
- An OpenAI API key (or compatible LLM endpoint)

### Run

```bash
git clone https://github.com/gadoza/langchain4j-demo.git
cd langchain4j-demo
./gradlew bootRun
```

## Author

**Mohamed Gad** — Senior Full-Stack Software Engineer  
Java · Spring Boot · Camunda BPM · Angular · Microservices  
📍 Riyadh, Saudi Arabia | metwallydev10@gmail.com  
[GitHub](https://github.com/gadoza)
