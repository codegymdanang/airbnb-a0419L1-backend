package com.airbnb.web.repository;

import com.airbnb.web.entity.ApartmentRent;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ApartmentRentRepository extends PagingAndSortingRepository<ApartmentRent,Long> {
}
