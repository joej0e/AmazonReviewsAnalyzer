package com.amazonreviewsanalyzer.controller;

import com.amazonreviewsanalyzer.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewController(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @DeleteMapping("/delete")
    public void deleteReview(Long reviewId) {
        reviewRepository.deleteById(reviewId);
    }

    @PatchMapping("/editReview")
    public void editReview(Long reviewId, String text) {
        reviewRepository.getOne(reviewId);
    }

}
