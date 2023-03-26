package com.touristguidesystem.TouristGuideSystem.repo;

import com.touristguidesystem.TouristGuideSystem.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {

    //Custom query for get activities in a given city
    @Query("SELECT a FROM Activity a JOIN a.activityCenter ac JOIN ac.location l WHERE l.city = :city")
    List<Activity> findByCity(@Param("city") String city);


    //Custom query method for sort activities by min and max price
    List<Activity> findByPriceBetween(int minPrice, int maxPrice);


    //Custom query method for sort activities by rating
    List<Activity> findByRates(int rates);


    //Custom query method for sort activities by activity type, ex:Adventure
    List<Activity> findByType(String type);
}
