package com.touristguidesystem.TouristGuideSystem.service;

import com.touristguidesystem.TouristGuideSystem.entity.Hotel;
import com.touristguidesystem.TouristGuideSystem.entity.Location;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

import java.util.List;

public interface HotelService {

    Hotel addHotel(Hotel hotel);

    List<Hotel> getHotels();

    List<Hotel> findByLocationCity(String city);

    List<Hotel> findByRoomsPriceBetween(int minPrice, int maxPrice);

    List<Hotel> findByRates(int rates);

}
