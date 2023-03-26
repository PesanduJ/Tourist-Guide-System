package com.touristguidesystem.TouristGuideSystem.api;

import com.touristguidesystem.TouristGuideSystem.dto.HotelDTO;
import com.touristguidesystem.TouristGuideSystem.entity.Activity;
import com.touristguidesystem.TouristGuideSystem.entity.Hotel;
import com.touristguidesystem.TouristGuideSystem.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/hotels")
public class HotelAPI {

    @Autowired
    private HotelService hotelService;



    //REST endpoint for expose operation for create new Hotel, you can access this by, http://localhost:8080/api/hotels/addHotel
    @PostMapping("/addHotel")
    public Hotel addHotel(@RequestBody HotelDTO hotelDTO){
        return hotelService.addHotel(hotelDTO.getHotel());
    }


    //REST endpoint for expose operation for find all Hotels, you can access this by, http://localhost:8080/api/hotels/findAllHotels
    @GetMapping("/findAllHotels")
    public List<Hotel> findAllHotels(){
        return hotelService.getHotels();
    }


    //REST endpoint for expose operation for search Hotels by city, you can access this by, http://localhost:8080/api/hotels/findHotelsByCity/negombo
    @GetMapping("/findHotelsByCity/{city}")
    public List<Hotel> searchByCity(@PathVariable("city") String city){
        return hotelService.findByLocationCity(city);
    }


    //REST endpoint for expose operation for sort Hotels by given price range, you can access this by, http://localhost:8080/api/hotels/sortByPriceRange?minPrice=50&maxPrice=200
    @GetMapping("/sortByPriceRange")
    public List<Hotel> getHotelsByPriceRange(@RequestParam int minPrice, @RequestParam int maxPrice) {
        return hotelService.findByRoomsPriceBetween(minPrice, maxPrice);
    }


    //REST endpoint for expose operation for sort Hotels by ratings, you can access this by, http://localhost:8080/api/hotels/sortByRates?rates=7
    @GetMapping("/sortByRates")
    public List<Hotel> getHotelsByRates(@RequestParam("rates") int rates) {
        return hotelService.findByRates(rates);
    }
}
