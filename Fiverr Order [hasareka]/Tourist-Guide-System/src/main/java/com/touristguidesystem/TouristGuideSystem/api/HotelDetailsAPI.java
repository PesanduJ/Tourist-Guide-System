package com.touristguidesystem.TouristGuideSystem.api;

import com.touristguidesystem.TouristGuideSystem.dto.HotelDetailsDTO;
import com.touristguidesystem.TouristGuideSystem.entity.HotelDetails;
import com.touristguidesystem.TouristGuideSystem.service.HotelDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/hotelDetails")
public class HotelDetailsAPI {

    @Autowired
    private HotelDetailsService hotelDetailsService;


    @PostMapping("/addHotelDetails")
    public HotelDetails addHotelDetails(@RequestBody HotelDetails hotelDetails){
        return hotelDetailsService.addHotelDetails(hotelDetails);
    }

    @GetMapping("/findAllHotelDetails")
    public List<HotelDetails> getAllHotelDetails(){
        return hotelDetailsService.getAllHotelDetails();
    }

    @GetMapping("/findHotelDetailsById/{id}")
    public HotelDetails getHotelDetailsById(@PathVariable Long id){
        return hotelDetailsService.getHotelDetailsById(id);
    }

    @PatchMapping("/updateHotelDetailsName/{id}")
    public HotelDetails updateName(@PathVariable Long id, @RequestParam String name) {
        return hotelDetailsService.updateName(id, name);
    }

    @PatchMapping("/updateHotelDetailsAddress/{id}")
    public HotelDetails updateAddress(@PathVariable Long id, @RequestParam String address) {
        return hotelDetailsService.updateAddress(id, address);
    }

    @PatchMapping("/updateHotelDetailsDescription/{id}")
    public HotelDetails updateDescription(@PathVariable Long id, @RequestParam String description) {
        return hotelDetailsService.updateDescription(id, description);
    }

    @PatchMapping("/updateHotelDetailsPhoneNo/{id}")
    public HotelDetails updatePhoneNo(@PathVariable Long id, @RequestParam String phoneNo) {
        return hotelDetailsService.updatePhoneNo(id, phoneNo);
    }

    @PatchMapping("/updateHotelDetailsEmail/{id}")
    public HotelDetails updateEmail(@PathVariable Long id, @RequestParam String email) {
        return hotelDetailsService.updateEmail(id, email);
    }

    @PatchMapping("/updateHotelDetailsPassword/{id}")
    public HotelDetails updatePassword(@PathVariable Long id, @RequestParam String password) {
        return hotelDetailsService.updatePassword(id, password);
    }

    @PatchMapping("/updateHotelDetailsPhoto/{id}")
    public HotelDetails updatePhoto(@PathVariable Long id, @RequestParam byte[] photo) {
        return hotelDetailsService.updatePhoto(id, photo);
    }

    @PatchMapping("/updateHotelDetailsLanguages/{id}")
    public HotelDetails updateLanguages(@PathVariable Long id, @RequestBody HotelDetailsDTO hotelDetailsDTO) {
        List<String> languages = hotelDetailsDTO.getLanguages();
        return hotelDetailsService.updateLanguage(id, languages);
    }

    @PatchMapping("/updateHotelDetailsFacilities/{id}")
    public HotelDetails updateFacilities(@PathVariable Long id, @RequestBody HotelDetailsDTO hotelDetailsDTO) {
        List<String> facilities = hotelDetailsDTO.getFacilities();
        return hotelDetailsService.updateFacilities(id, facilities);
    }

    @PatchMapping("/updateHotelDetailsServices/{id}")
    public HotelDetails updateServices(@PathVariable Long id, @RequestBody HotelDetailsDTO hotelDetailsDTO) {
        List<String> services = hotelDetailsDTO.getServices();
        return hotelDetailsService.updateServices(id, services);
    }

    @PatchMapping("/updateHotelDetailsMostCommonAmenities/{id}")
    public HotelDetails updateMostCommonAmenities(@PathVariable Long id, @RequestBody HotelDetailsDTO hotelDetailsDTO) {
        List<String> mostCommonAmenities = hotelDetailsDTO.getMostCommonAmenities();
        return hotelDetailsService.updateMostCommonAmenities(id, mostCommonAmenities);
    }

    @PatchMapping("/updateHotelDetailsOtherAmenities/{id}")
    public HotelDetails updateOtherAmenities(@PathVariable Long id, @RequestBody HotelDetailsDTO hotelDetailsDTO) {
        List<String> otherAmenities = hotelDetailsDTO.getOtherAmenities();
        return hotelDetailsService.updateOtherAmenities(id, otherAmenities);
    }
}
