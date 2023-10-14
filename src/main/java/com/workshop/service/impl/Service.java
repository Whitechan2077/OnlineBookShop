package com.workshop.service.impl;

import java.util.Collection;
public interface Service<T,K> {
    public Collection<T> findAll();
    public T findById(K id);
    public void insert(K e);
    public void update(K e);
    public void delete(K e);
}
