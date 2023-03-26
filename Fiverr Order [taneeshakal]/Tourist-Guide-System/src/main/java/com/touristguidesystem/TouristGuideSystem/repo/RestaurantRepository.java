package com.touristguidesystem.TouristGuideSystem.repo;

import com.touristguidesystem.TouristGuideSystem.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    //Custom query method for sort restaurants in a given price range
    List<Restaurant> findByPriceBetween(int minPrice, int maxPrice);


    //Custom query method for sort restaurants by rating
    List<Restaurant> findByRates(int rates);
}
