package com.example.websocketsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@Controller
public class ChatController {
    @GetMapping("/chat")
    public String chat(Model model) {
        model.addAttribute("username", UUID.randomUUID().toString());
        return "chat";
    }
}
