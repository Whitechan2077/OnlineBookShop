package com.workshop.service;

import com.workshop.entity.Account;
import com.workshop.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AccountService implements com.workshop.service.impl.Service<Account,Long> {
    @Autowired
    AccountRepository repository;

    @Override
    public Collection<Account> findAll() {
        return  repository.findAll();
    }

    @Override
    public Account findById(Long id) {
        return null;
    }

    @Override
    public void insert(Long e) {

    }

    @Override
    public void update(Long e) {

    }

    @Override
    public void delete(Long e) {

    }
}
