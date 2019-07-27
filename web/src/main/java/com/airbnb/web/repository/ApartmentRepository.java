package com.airbnb.web.repository;

import com.airbnb.web.entity.Apartment;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ApartmentRepository extends PagingAndSortingRepository<Apartment,Long> {
}
