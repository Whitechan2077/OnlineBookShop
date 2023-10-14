package com.workshop.bookstore.repositories;

import com.workshop.bookstore.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

public class main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        accountService.findAll().forEach(account -> account.getUid());
    }
}
