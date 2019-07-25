package com.airbnb.web.service;

import com.airbnb.web.model.Customer;

import java.util.Optional;

public interface CustomerService {
    Iterable<Customer> findAll();

    Optional<Customer> findById(Long id);

    void save(Customer customer);

//    void remove(Long id);

}
