package com.workshop.bookstore.service.impl;

import java.util.Collection;

public interface Service <T,K>{
    public Collection<T> findAll();
    public T findById(K id);
    public void insert(T e);
    public void update(T e);
    public void delete(T e);
}
