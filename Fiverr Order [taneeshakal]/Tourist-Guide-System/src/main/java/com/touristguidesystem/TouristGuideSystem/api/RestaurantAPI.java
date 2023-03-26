package com.touristguidesystem.TouristGuideSystem.api;

import com.touristguidesystem.TouristGuideSystem.dto.RestaurantDTO;
import com.touristguidesystem.TouristGuideSystem.entity.Activity;
import com.touristguidesystem.TouristGuideSystem.entity.Restaurant;
import com.touristguidesystem.TouristGuideSystem.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantAPI {

    @Autowired
    private RestaurantService restaurantService;



    //REST endpoint for expose operation for create new Restaurant, you can access this by, http://localhost:8080/api/restaurants/addRestaurant
    @PostMapping("/addRestaurant")
    public Restaurant addRestaurant(@RequestBody RestaurantDTO restaurantDTO){
        return restaurantService.addRestaurant(restaurantDTO.getRestaurant());
    }


    //REST endpoint for expose operation for find all Restaurants, you can access this by, http://localhost:8080/api/restaurants/findAllRestaurants
    @GetMapping("/findAllRestaurants")
    public List<Restaurant> findAllRestaurants(){
        return restaurantService.getRestaurants();
    }


    //REST endpoint for expose operation for sort Restaurants by given price range, you can access this by, http://localhost:8080/api/restaurants/sortByPriceRange?minPrice=40&maxPrice=200
    @GetMapping("/sortByPriceRange")
    public List<Restaurant> findByPriceRange(@RequestParam("minPrice") int minPrice, @RequestParam("maxPrice") int maxPrice) {
        return restaurantService.findByPriceBetween(minPrice, maxPrice);
    }


    //REST endpoint for expose operation for sort Restaurants by ratings, you can access this by, http://localhost:8080/api/restaurants/sortByRates?rates=6
    @GetMapping("/sortByRates")
    public List<Restaurant> getRestaurantsByRates(@RequestParam("rates") int rates) {
        return restaurantService.findByRates(rates);
    }
}
