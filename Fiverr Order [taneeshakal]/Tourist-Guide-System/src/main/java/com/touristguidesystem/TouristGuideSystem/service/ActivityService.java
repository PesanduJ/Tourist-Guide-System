package com.touristguidesystem.TouristGuideSystem.service;

import com.touristguidesystem.TouristGuideSystem.entity.Activity;
import com.touristguidesystem.TouristGuideSystem.entity.Location;

import java.util.List;

public interface ActivityService {

    Activity addActivity(Activity activity);

    List<Activity> getActivites();

    List<Activity> findByCity(String city);

    List<Activity> findByPriceRange(int minPrice, int maxPrice);

    List<Activity> findByRates(int rates);

    List<Activity> findByType(String type);

}
