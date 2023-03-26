package com.touristguidesystem.TouristGuideSystem.service;

import com.touristguidesystem.TouristGuideSystem.entity.Review;

import java.util.List;

public interface ReviewService {

    Review addReview(Review review);

    List<Review> showAllReviews();
}
