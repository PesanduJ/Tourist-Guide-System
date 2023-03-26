package com.touristguidesystem.TouristGuideSystem.service;

import com.touristguidesystem.TouristGuideSystem.entity.ActivityDetails;
import com.touristguidesystem.TouristGuideSystem.entity.RestaurantDetails;
import com.touristguidesystem.TouristGuideSystem.repo.RestaurantDetailsRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantDetailsServiceIMPL implements RestaurantDetailsService{

    @Autowired
    private RestaurantDetailsRepository restaurantDetailsRepository;


    @Override
    public RestaurantDetails addRestaurantDetails(RestaurantDetails restaurantDetails) {
        return restaurantDetailsRepository.save(restaurantDetails);
    }

    @Override
    public List<RestaurantDetails> findAllRestaurantDetails() {
        return restaurantDetailsRepository.findAll();
    }

    @Override
    public RestaurantDetails getRestaurantDetailsById(Long id) {
        return restaurantDetailsRepository.findById(id).orElse(null);
    }

    @Override
    public RestaurantDetails updateName(Long id, String name) {
        RestaurantDetails restaurantDetails = restaurantDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Restaurant details not found"));
        restaurantDetails.setName(name);
        return restaurantDetailsRepository.save(restaurantDetails);
    }

    @Override
    public RestaurantDetails updateAddress(Long id, String address) {
        RestaurantDetails restaurantDetails = restaurantDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Restaurant details not found"));
        restaurantDetails.setAddress(address);
        return restaurantDetailsRepository.save(restaurantDetails);
    }

    @Override
    public RestaurantDetails updateOpeningHours(Long id, String openingHours) {
        RestaurantDetails restaurantDetails = restaurantDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Restaurant details not found"));
        restaurantDetails.setOpeningHours(openingHours);
        return restaurantDetailsRepository.save(restaurantDetails);
    }

    @Override
    public RestaurantDetails updatePhoneNo(Long id, String phoneNo) {
        RestaurantDetails restaurantDetails = restaurantDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Restaurant details not found"));
        restaurantDetails.setPhoneNo(phoneNo);
        return restaurantDetailsRepository.save(restaurantDetails);
    }

    @Override
    public RestaurantDetails updateEmail(Long id, String email) {
        RestaurantDetails restaurantDetails = restaurantDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Restaurant details not found"));
        restaurantDetails.setEmail(email);
        return restaurantDetailsRepository.save(restaurantDetails);
    }

    @Override
    public RestaurantDetails updatePassword(Long id, String password) {
        RestaurantDetails restaurantDetails = restaurantDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Restaurant details not found"));
        restaurantDetails.setPassword(password);
        return restaurantDetailsRepository.save(restaurantDetails);
    }

    @Override
    public RestaurantDetails updatePhoto(Long id, byte[] photo) {
        RestaurantDetails restaurantDetails = restaurantDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Restaurant details not found"));
        restaurantDetails.setPhoto(photo);
        return restaurantDetailsRepository.save(restaurantDetails);
    }

    @Override
    public RestaurantDetails updateLanguage(Long id, List<String> languages) {
        RestaurantDetails restaurantDetails = restaurantDetailsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Activity details not found"));
        restaurantDetails.setLanguages(languages);
        return restaurantDetailsRepository.save(restaurantDetails);
    }

    @Override
    public RestaurantDetails updateMealsServed(Long id, List<String> mealsServed) {
        RestaurantDetails restaurantDetails = restaurantDetailsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Activity details not found"));
        restaurantDetails.setMealsServed(mealsServed);
        return restaurantDetailsRepository.save(restaurantDetails);
    }

    @Override
    public RestaurantDetails updatePaymentMethods(Long id, List<String> paymentMethods) {
        RestaurantDetails restaurantDetails = restaurantDetailsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Activity details not found"));
        restaurantDetails.setPaymentMethods(paymentMethods);
        return restaurantDetailsRepository.save(restaurantDetails);
    }

    @Override
    public RestaurantDetails updateParking(Long id, List<String> parking) {
        RestaurantDetails restaurantDetails = restaurantDetailsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Activity details not found"));
        restaurantDetails.setParking(parking);
        return restaurantDetailsRepository.save(restaurantDetails);
    }

    @Override
    public RestaurantDetails updateAtmosphere(Long id, List<String> atmosphere) {
        RestaurantDetails restaurantDetails = restaurantDetailsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Activity details not found"));
        restaurantDetails.setAtmosphere(atmosphere);
        return restaurantDetailsRepository.save(restaurantDetails);
    }

    @Override
    public RestaurantDetails updateAdditional(Long id, List<String> additional) {
        RestaurantDetails restaurantDetails = restaurantDetailsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Activity details not found"));
        restaurantDetails.setAdditional(additional);
        return restaurantDetailsRepository.save(restaurantDetails);
    }


}
