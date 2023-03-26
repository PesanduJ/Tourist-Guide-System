package com.touristguidesystem.TouristGuideSystem.api;


import com.touristguidesystem.TouristGuideSystem.dto.ActivityDTO;
import com.touristguidesystem.TouristGuideSystem.dto.HotelDTO;
import com.touristguidesystem.TouristGuideSystem.entity.Activity;
import com.touristguidesystem.TouristGuideSystem.entity.ActivityCenter;
import com.touristguidesystem.TouristGuideSystem.entity.Hotel;
import com.touristguidesystem.TouristGuideSystem.entity.Location;
import com.touristguidesystem.TouristGuideSystem.service.ActivityService;
import com.touristguidesystem.TouristGuideSystem.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController                         //Used to create RESTful web services using Spring MVC
@RequestMapping("/api/activities")      //Used to map web requests onto specific handler classes and/or handler methods
public class ActivityAPI {


    @Autowired                          //Used for dependency injection
    private ActivityService activityService;


    //REST endpoint for expose operation for create new Activity, you can access this by, http://localhost:8080/api/activities/addActivity
    @PostMapping("/addActivity")
    public Activity addActivity(@RequestBody ActivityDTO activityDTO){
        return activityService.addActivity(activityDTO.getActivity());
    }


    //REST endpoint for expose operation for get all Activities as a list, you can access this by, http://localhost:8080/api/activities/getActivities
    @GetMapping("/getActivities")
    public List<Activity> getActivities(){
        return activityService.getActivites();
    }


    //REST endpoint for expose operation for get all Activities by city, you can access this by, http://localhost:8080/api/activities/findActivitiesByCity/negombo
    @GetMapping("/findActivitiesByCity/{city}")
    public List<Activity> getActivitiesByCity(@PathVariable String city) {
        return activityService.findByCity(city);
    }


    //REST endpoint for expose operation for sort Activities by given price range, you can access this by, http://localhost:8080/api/activities/sortByPriceRange?minPrice=50&maxPrice=600
    @GetMapping("/sortByPriceRange")
    public List<Activity> findByPriceRange(@RequestParam("minPrice") int minPrice, @RequestParam("maxPrice") int maxPrice) {
        return activityService.findByPriceRange(minPrice, maxPrice);
    }


    //REST endpoint for expose operation for sort Activities by ratings, you can access this by, http://localhost:8080/api/activities/sortByRates?rates=3
    @GetMapping("/sortByRates")
    public List<Activity> getActivitiesByRates(@RequestParam("rates") int rates) {
        return activityService.findByRates(rates);
    }


    //REST endpoint for expose operation for sort Activities by type, you can access this by, http://localhost:8080/api/activities/sortByType?type=Adventure
    @GetMapping("/sortByType")
    public List<Activity> getActivitiesByType(@RequestParam("type") String type) {
        return activityService.findByType(type);
    }
}
