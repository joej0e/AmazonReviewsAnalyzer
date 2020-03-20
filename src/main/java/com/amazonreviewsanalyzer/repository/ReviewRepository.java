package com.amazonreviewsanalyzer.repository;

import com.amazonreviewsanalyzer.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
