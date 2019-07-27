package com.airbnb.web.service;

import com.airbnb.web.entity.Apartment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ApartmentService {
    Page<Apartment> findAll(Pageable pageable);

    Optional<Apartment> findById(Long id);

    void save(Apartment apartment);

    void remove(Long id);
}
