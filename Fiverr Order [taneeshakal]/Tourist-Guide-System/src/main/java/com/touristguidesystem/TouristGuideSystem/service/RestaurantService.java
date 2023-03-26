package com.touristguidesystem.TouristGuideSystem.service;

import com.touristguidesystem.TouristGuideSystem.entity.Restaurant;

import java.util.List;

public interface RestaurantService {

    Restaurant addRestaurant(Restaurant restaurant);

    List<Restaurant> getRestaurants();

    List<Restaurant> findByPriceBetween(int minPrice, int maxPrice);

    List<Restaurant> findByRates(int rates);
}
