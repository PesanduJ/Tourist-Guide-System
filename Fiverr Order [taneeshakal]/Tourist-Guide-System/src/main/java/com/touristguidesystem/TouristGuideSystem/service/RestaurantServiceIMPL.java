package com.touristguidesystem.TouristGuideSystem.service;

import com.touristguidesystem.TouristGuideSystem.entity.Restaurant;
import com.touristguidesystem.TouristGuideSystem.repo.RestaurantRepository;
import com.touristguidesystem.TouristGuideSystem.repo.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceIMPL implements RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private TableRepository tableRepository;

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public List<Restaurant> getRestaurants() {
        return restaurantRepository.findAll();
    }

    @Override
    public List<Restaurant> findByPriceBetween(int minPrice, int maxPrice) {
        return restaurantRepository.findByPriceBetween(minPrice, maxPrice);
    }

    @Override
    public List<Restaurant> findByRates(int rates) {
        return restaurantRepository.findByRates(rates);
    }
}
