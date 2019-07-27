package com.airbnb.web.service;

import com.airbnb.web.entity.ApartmentRent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ApartmentRentService {
    Page<ApartmentRent> findAll(Pageable pageable);

    Optional<ApartmentRent> findById(Long id);

    void save(ApartmentRent apartmentRent);

    void remove(Long id);
}
