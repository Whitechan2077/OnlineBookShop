package com.workshop.bookstore.controller;

import com.workshop.bookstore.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping
public class ControllerTest {
    @Autowired
    AccountRepository accountRepository;
    @GetMapping("")
    public String home(Model model){
        model.addAttribute("allUser",accountRepository.findAll());
        return "Lythuyet";
    }
}
