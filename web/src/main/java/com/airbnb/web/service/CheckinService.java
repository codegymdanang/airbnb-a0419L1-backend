package com.airbnb.web.service;

import com.airbnb.web.entity.Checkin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CheckinService {
    Page<Checkin> findAll(Pageable pageable);

    Optional<Checkin> findById(Long id);

    void save(Checkin checkin);

    void remove(Long id);
}
