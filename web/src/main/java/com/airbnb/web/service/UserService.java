package com.airbnb.web.service;

import com.airbnb.web.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserService {
    Page<User> findAll(Pageable pageable);

    Optional<User> findById(Long id);

    void save(User user);

    void remove(Long id);
}
