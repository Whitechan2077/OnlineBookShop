package com.workshop.bookstore.repositories;

import com.workshop.bookstore.entity.Sach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Sach,Integer> {
}
