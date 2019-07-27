package com.airbnb.web.service;

import com.airbnb.web.entity.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CountryService {
    Page<Country> findAll(Pageable pageable);

    Optional<Country> findById(Long id);

    void save(Country country);

    void remove(Long id);
}
