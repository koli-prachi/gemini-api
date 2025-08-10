package com.prachi.spring_boot_chat_gpt.controller;


import com.prachi.spring_boot_chat_gpt.service.GeminiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/gemini")
public class GeminiController {

    private final GeminiService geminiService;

    @GetMapping("/ask")
    public String askGeminiAPI(@RequestBody String prompt){

        return geminiService.askGemini(prompt);

    }
}
