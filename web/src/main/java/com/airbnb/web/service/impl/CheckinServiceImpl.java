package com.airbnb.web.service.impl;

import com.airbnb.web.entity.Checkin;
import com.airbnb.web.repository.CheckinRepository;
import com.airbnb.web.service.CheckinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CheckinServiceImpl implements CheckinService {
    @Autowired
    private CheckinRepository checkinRepository;

    @Override
    public Page<Checkin> findAll(Pageable pageable) {
        return checkinRepository.findAll(pageable);
    }

    @Override
    public Optional<Checkin> findById(Long id) {
        return checkinRepository.findById(id);
    }

    @Override
    public void save(Checkin checkin) {
        checkinRepository.save(checkin);
    }

    @Override
    public void remove(Long id) {
        checkinRepository.deleteById(id);
    }
}
