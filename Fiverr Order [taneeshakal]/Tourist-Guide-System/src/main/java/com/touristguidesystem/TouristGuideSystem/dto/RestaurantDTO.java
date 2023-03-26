package com.touristguidesystem.TouristGuideSystem.dto;

import com.touristguidesystem.TouristGuideSystem.entity.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RestaurantDTO {

    private Restaurant restaurant;
}
