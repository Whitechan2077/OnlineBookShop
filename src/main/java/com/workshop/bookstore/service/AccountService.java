package com.workshop.bookstore.service;

import com.workshop.bookstore.entity.Account;
import com.workshop.bookstore.repositories.AccountRepository;
import com.workshop.bookstore.service.impl.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
@org.springframework.stereotype.Service
public class AccountService implements Service<Account,Long> {
    @Autowired
    AccountRepository accountRepository;
    @Override
    public Collection<Account> findAll() {
       return accountRepository.findAll();
    }

    @Override
    public Account findById(Long id) {
        return null;
    }

    @Override
    public void insert(Account e) {

    }

    @Override
    public void update(Account e) {

    }

    @Override
    public void delete(Account e) {

    }
}
