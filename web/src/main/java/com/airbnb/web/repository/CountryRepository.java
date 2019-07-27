package com.airbnb.web.repository;

import com.airbnb.web.entity.Country;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {
}
