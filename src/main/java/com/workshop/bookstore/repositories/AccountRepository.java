package com.workshop.bookstore.repositories;

import com.workshop.bookstore.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountEntity,Integer> {
}
