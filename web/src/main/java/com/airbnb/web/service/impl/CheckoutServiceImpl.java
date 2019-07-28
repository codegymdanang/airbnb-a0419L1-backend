//package com.airbnb.web.service.impl;
//
//import com.airbnb.web.entity.Checkout;
//import com.airbnb.web.repository.CheckoutRepository;
//import com.airbnb.web.service.CheckoutService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//@Service
//public class CheckoutServiceImpl implements CheckoutService {
//    @Autowired
//    private CheckoutRepository checkoutRepository;
//
//    @Override
//    public Page<Checkout> findAll(Pageable pageable) {
//        return checkoutRepository.findAll(pageable);
//    }
//
//    @Override
//    public Optional<Checkout> findById(Long id) {
//        return checkoutRepository.findById(id);
//    }
//
//    @Override
//    public void save(Checkout checkout) {
//        checkoutRepository.save(checkout);
//    }
//
//    @Override
//    public void remove(Long id) {
//        checkoutRepository.deleteById(id);
//    }
//}
