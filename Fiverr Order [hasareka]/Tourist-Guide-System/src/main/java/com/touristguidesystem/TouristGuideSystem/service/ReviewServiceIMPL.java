package com.touristguidesystem.TouristGuideSystem.service;

import com.touristguidesystem.TouristGuideSystem.entity.Review;
import com.touristguidesystem.TouristGuideSystem.repo.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReviewServiceIMPL implements ReviewService{

    @Autowired
    private ReviewRepository reviewRepository;


    @Override
    public Review addReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public List<Review> showAllReviews() {
        return reviewRepository.findAll();
    }
}
