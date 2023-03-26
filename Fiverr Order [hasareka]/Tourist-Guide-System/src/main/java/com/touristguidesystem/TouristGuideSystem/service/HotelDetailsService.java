package com.touristguidesystem.TouristGuideSystem.service;

import com.touristguidesystem.TouristGuideSystem.entity.HotelDetails;
import com.touristguidesystem.TouristGuideSystem.entity.User;

import java.util.List;

public interface HotelDetailsService {

    HotelDetails addHotelDetails(HotelDetails hotelDetails);
    List<HotelDetails> getAllHotelDetails();
    HotelDetails getHotelDetailsById(Long id);


    HotelDetails updateName(Long id, String name);
    HotelDetails updateAddress(Long id, String address);
    HotelDetails updateDescription(Long id, String description);
    HotelDetails updatePhoneNo(Long id, String phoneNo);
    HotelDetails updateEmail(Long id, String email);
    HotelDetails updatePassword(Long id, String password);
    HotelDetails updatePhoto(Long id, byte[] photo);
    HotelDetails updateLanguage(Long id, List<String> languages);
    HotelDetails updateFacilities(Long id, List<String> facilities);
    HotelDetails updateServices(Long id, List<String> services);
    HotelDetails updateMostCommonAmenities(Long id, List<String> mostCommonAmenities);
    HotelDetails updateOtherAmenities(Long id, List<String> otherAmenities);
}
