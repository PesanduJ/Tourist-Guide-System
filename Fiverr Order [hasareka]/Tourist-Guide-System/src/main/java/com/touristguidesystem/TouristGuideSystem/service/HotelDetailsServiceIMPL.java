package com.touristguidesystem.TouristGuideSystem.service;

import com.touristguidesystem.TouristGuideSystem.entity.HotelDetails;
import com.touristguidesystem.TouristGuideSystem.repo.HotelDetailsRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelDetailsServiceIMPL implements HotelDetailsService{


    @Autowired
    private HotelDetailsRepository hotelDetailsRepository;

    @Override
    public HotelDetails addHotelDetails(HotelDetails hotelDetails) {
        return hotelDetailsRepository.save(hotelDetails);
    }

    @Override
    public List<HotelDetails> getAllHotelDetails() {
        return hotelDetailsRepository.findAll();
    }

    @Override
    public HotelDetails getHotelDetailsById(Long id) {
        return hotelDetailsRepository.findById(id).orElse(null);
    }

    @Override
    public HotelDetails updateName(Long id, String name) {
        HotelDetails hotelDetails = hotelDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Hotel details not found"));
        hotelDetails.setName(name);
        return hotelDetailsRepository.save(hotelDetails);
    }

    @Override
    public HotelDetails updateAddress(Long id, String address) {
        HotelDetails hotelDetails = hotelDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Hotel details not found"));
        hotelDetails.setAddress(address);
        return hotelDetailsRepository.save(hotelDetails);
    }

    @Override
    public HotelDetails updateDescription(Long id, String description) {
        HotelDetails hotelDetails = hotelDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Hotel details not found"));
        hotelDetails.setDescription(description);
        return hotelDetailsRepository.save(hotelDetails);
    }

    @Override
    public HotelDetails updatePhoneNo(Long id, String phoneNo) {
        HotelDetails hotelDetails = hotelDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Hotel details not found"));
        hotelDetails.setPhoneNo(phoneNo);
        return hotelDetailsRepository.save(hotelDetails);
    }

    @Override
    public HotelDetails updateEmail(Long id, String email) {
        HotelDetails hotelDetails = hotelDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Hotel details not found"));
        hotelDetails.setEmail(email);
        return hotelDetailsRepository.save(hotelDetails);
    }

    @Override
    public HotelDetails updatePassword(Long id, String password) {
        HotelDetails hotelDetails = hotelDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Hotel details not found"));
        hotelDetails.setPassword(password);
        return hotelDetailsRepository.save(hotelDetails);
    }

    @Override
    public HotelDetails updatePhoto(Long id, byte[] photo) {
        HotelDetails hotelDetails = hotelDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Hotel details not found"));
        hotelDetails.setPhoto(photo);
        return hotelDetailsRepository.save(hotelDetails);
    }

    @Override
    public HotelDetails updateLanguage(Long id, List<String> languages) {
        HotelDetails hotelDetails = hotelDetailsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Hotel details not found"));
        hotelDetails.setLanguages(languages);
        return hotelDetailsRepository.save(hotelDetails);
    }

    @Override
    public HotelDetails updateFacilities(Long id, List<String> facilities) {
        HotelDetails hotelDetails = hotelDetailsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Hotel details not found"));
        hotelDetails.setFacilities(facilities);
        return hotelDetailsRepository.save(hotelDetails);
    }

    @Override
    public HotelDetails updateServices(Long id, List<String> services) {
        HotelDetails hotelDetails = hotelDetailsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Hotel details not found"));
        hotelDetails.setServices(services);
        return hotelDetailsRepository.save(hotelDetails);
    }

    @Override
    public HotelDetails updateMostCommonAmenities(Long id, List<String> mostCommonAmenities) {
        HotelDetails hotelDetails = hotelDetailsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Hotel details not found"));
        hotelDetails.setMostCommonAmenities(mostCommonAmenities);
        return hotelDetailsRepository.save(hotelDetails);
    }

    @Override
    public HotelDetails updateOtherAmenities(Long id, List<String> otherAmenities) {
        HotelDetails hotelDetails = hotelDetailsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Hotel details not found"));
        hotelDetails.setOtherAmenities(otherAmenities);
        return hotelDetailsRepository.save(hotelDetails);
    }
}
