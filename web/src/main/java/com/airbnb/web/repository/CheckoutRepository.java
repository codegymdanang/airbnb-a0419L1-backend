package com.airbnb.web.repository;

import com.airbnb.web.entity.Checkout;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CheckoutRepository extends PagingAndSortingRepository<Checkout,Long> {
}
