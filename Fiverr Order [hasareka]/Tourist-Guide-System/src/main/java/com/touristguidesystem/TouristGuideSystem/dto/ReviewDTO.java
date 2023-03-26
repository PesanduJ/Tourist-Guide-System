package com.touristguidesystem.TouristGuideSystem.dto;

import com.touristguidesystem.TouristGuideSystem.entity.Review;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ReviewDTO {

    private Review review;
}
