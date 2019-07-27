package com.airbnb.web.service.impl;

import com.airbnb.web.entity.ApartmentRent;
import com.airbnb.web.repository.ApartmentRentRepository;
import com.airbnb.web.service.ApartmentRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class ApartmentRentServiceImpl implements ApartmentRentService {
    @Autowired
    private ApartmentRentRepository apartmentRentRepository;

    @Override
    public Page<ApartmentRent> findAll(Pageable pageable) {
        return apartmentRentRepository.findAll(pageable);
    }

    @Override
    public Optional<ApartmentRent> findById(Long id) {
        return apartmentRentRepository.findById(id);
    }

    @Override
    public void save(ApartmentRent apartmentRent) {
        apartmentRentRepository.save(apartmentRent);
    }

    @Override
    public void remove(Long id) {
        apartmentRentRepository.deleteById(id);
    }
}
