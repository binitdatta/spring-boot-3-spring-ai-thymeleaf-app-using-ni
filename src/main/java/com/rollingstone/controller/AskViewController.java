package com.rollingstone.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AskViewController {

    /**
     * Render the Thymeleaf page for asking questions.
     * Accessible at http://localhost:8014/ask-ui
     */
    @GetMapping("/ask-ui")
    public String renderAskPage() {
        return "ask"; // Thymeleaf will resolve to src/main/resources/templates/ask.html
    }
}

