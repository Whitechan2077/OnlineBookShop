package com.workshop.bookstore.controller;

import com.workshop.bookstore.repositories.BookRepository;
import com.workshop.bookstore.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping
public class ControllerTest {
    @Autowired
    AccountService accountService;
    @Autowired
    BookRepository bookRepository;
    @GetMapping("")
    public String home(Model model){
//        model.addAttribute("allUser",accountService.findAll());
        return "Lythuyet";
    }
}
