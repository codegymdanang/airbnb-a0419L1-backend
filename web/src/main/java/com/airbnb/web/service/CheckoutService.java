package com.airbnb.web.service;

import com.airbnb.web.entity.Checkout;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CheckoutService {
    Page<Checkout> findAll(Pageable pageable);

    Optional<Checkout> findById(Long id);

    void save(Checkout checkout);

    void remove(Long id);
}
