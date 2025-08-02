package com.rollingstone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticController {

    @GetMapping("/spring-ai")
    public String renderPageSpringAI() {
        return "spring-ai-vs-langchain";
    }

    @GetMapping("/rag")
    public String renderPageRag() {
        return "rag";
    }

    @GetMapping("/nlp")
    public String renderNLPPage() {
        return "nlp-generative-ai";
    }

    @GetMapping("/neural-networks")
    public String rendePageNN() {
        return "neural-networks";
    }

    @GetMapping("/how-ml-works")
    public String rendePageHowMLWorks() {
        return "how-ml-works";
    }

    @GetMapping("/genai-energy")
    public String rendePageGenAIEnergy() {
        return "genai-energy";
    }





    @GetMapping("/gen-ai-history")
    public String rendePageHistory() {
        return "generative-ai-history";
    }
}
