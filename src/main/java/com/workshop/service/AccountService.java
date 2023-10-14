package com.workshop.service;

import com.workshop.entity.Account;
import com.workshop.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AccountService  {
    @Autowired
    AccountRepository repository;
    public Collection<Account> findAllAccount(){
        return  repository.findAll();
    }
}
