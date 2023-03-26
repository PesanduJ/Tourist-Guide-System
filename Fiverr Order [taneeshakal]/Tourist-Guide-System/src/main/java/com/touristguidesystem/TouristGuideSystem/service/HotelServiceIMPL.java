package com.touristguidesystem.TouristGuideSystem.service;

import com.touristguidesystem.TouristGuideSystem.entity.Hotel;
import com.touristguidesystem.TouristGuideSystem.entity.Location;
import com.touristguidesystem.TouristGuideSystem.repo.HotelRepository;
import com.touristguidesystem.TouristGuideSystem.repo.LocationRepository;
import com.touristguidesystem.TouristGuideSystem.repo.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceIMPL implements HotelService{

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public Hotel addHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public List<Hotel> findByLocationCity(String city) {
        return hotelRepository.findByLocationCity(city);
    }

    @Override
    public List<Hotel> findByRoomsPriceBetween(int minPrice, int maxPrice) {
        return hotelRepository.findByRoomsPriceBetween(minPrice, maxPrice);
    }

    @Override
    public List<Hotel> findByRates(int rates) {
        return hotelRepository.findByRates(rates);
    }

}
