package com.touristguidesystem.TouristGuideSystem.repo;

import com.touristguidesystem.TouristGuideSystem.entity.Activity;
import com.touristguidesystem.TouristGuideSystem.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long> {

    //Custom query method for find hotels by city
    List<Hotel> findByLocationCity(String city);


    //Custom query method for sort hotels by price range
    List<Hotel> findByRoomsPriceBetween(int minPrice, int maxPrice);


    //Custom query method for sort hotels by rating
    List<Hotel> findByRates(int rates);
}
