package com.airbnb.web.repository;

import com.airbnb.web.entity.Review;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ReviewRepository extends PagingAndSortingRepository<Review, Long> {
}
