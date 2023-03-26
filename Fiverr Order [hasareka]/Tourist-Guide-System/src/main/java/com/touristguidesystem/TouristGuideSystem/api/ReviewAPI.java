package com.touristguidesystem.TouristGuideSystem.api;

import com.touristguidesystem.TouristGuideSystem.dto.ReviewDTO;
import com.touristguidesystem.TouristGuideSystem.dto.UserDTO;
import com.touristguidesystem.TouristGuideSystem.entity.Review;
import com.touristguidesystem.TouristGuideSystem.entity.User;
import com.touristguidesystem.TouristGuideSystem.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewAPI {

    @Autowired
    private ReviewService reviewService;


    @PostMapping("/addReview")
    public Review addUser(@RequestBody Review review){
        return reviewService.addReview(review);
    }


    @GetMapping("/showAllReviews")
    public List<Review> showAllReviews(){
        return reviewService.showAllReviews();
    }
}
