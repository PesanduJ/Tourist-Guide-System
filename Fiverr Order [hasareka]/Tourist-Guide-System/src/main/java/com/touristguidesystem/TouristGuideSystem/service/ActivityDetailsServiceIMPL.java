package com.touristguidesystem.TouristGuideSystem.service;

import com.touristguidesystem.TouristGuideSystem.entity.ActivityDetails;
import com.touristguidesystem.TouristGuideSystem.entity.HotelDetails;
import com.touristguidesystem.TouristGuideSystem.repo.ActivityDetailsRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityDetailsServiceIMPL implements ActivityDetailsService{

    @Autowired
    private ActivityDetailsRepository activityDetailsRepository;

    @Override
    public ActivityDetails addActivityDetails(ActivityDetails activityDetails) {
        return activityDetailsRepository.save(activityDetails);
    }

    @Override
    public List<ActivityDetails> findAllActivityDetails() {
        return activityDetailsRepository.findAll();
    }

    @Override
    public ActivityDetails getActivityDetailsById(Long id) {
        return activityDetailsRepository.findById(id).orElse(null);
    }

    @Override
    public ActivityDetails updateName(Long id, String name) {
        ActivityDetails activityDetails = activityDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Activity details not found"));
        activityDetails.setName(name);
        return activityDetailsRepository.save(activityDetails);
    }

    @Override
    public ActivityDetails updateAddress(Long id, String address) {
        ActivityDetails activityDetails = activityDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Activity details not found"));
        activityDetails.setAddress(address);
        return activityDetailsRepository.save(activityDetails);
    }

    @Override
    public ActivityDetails updateTourDuration(Long id, String tourDuration) {
        ActivityDetails activityDetails = activityDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Activity details not found"));
        activityDetails.setTourDuration(tourDuration);
        return activityDetailsRepository.save(activityDetails);
    }

    @Override
    public ActivityDetails updatePhoneNo(Long id, String phoneNo) {
        ActivityDetails activityDetails = activityDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Activity details not found"));
        activityDetails.setPhoneNo(phoneNo);
        return activityDetailsRepository.save(activityDetails);
    }

    @Override
    public ActivityDetails updateEmail(Long id, String email) {
        ActivityDetails activityDetails = activityDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Activity details not found"));
        activityDetails.setEmail(email);
        return activityDetailsRepository.save(activityDetails);
    }

    @Override
    public ActivityDetails updatePassword(Long id, String password) {
        ActivityDetails activityDetails = activityDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Activity details not found"));
        activityDetails.setPassword(password);
        return activityDetailsRepository.save(activityDetails);
    }

    @Override
    public ActivityDetails updatePhoto(Long id, byte[] photo) {
        ActivityDetails activityDetails = activityDetailsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Activity details not found"));
        activityDetails.setPhoto(photo);
        return activityDetailsRepository.save(activityDetails);
    }

    @Override
    public ActivityDetails updateLanguage(Long id, List<String> languages) {
        ActivityDetails activityDetails = activityDetailsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Activity details not found"));
        activityDetails.setLanguages(languages);
        return activityDetailsRepository.save(activityDetails);
    }

    @Override
    public ActivityDetails updateServices(Long id, List<String> services) {
        ActivityDetails activityDetails = activityDetailsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Activity details not found"));
        activityDetails.setServices(services);
        return activityDetailsRepository.save(activityDetails);
    }

    @Override
    public ActivityDetails updateMealsProvided(Long id, List<String> mealsProvided) {
        ActivityDetails activityDetails = activityDetailsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Activity details not found"));
        activityDetails.setMealsProvided(mealsProvided);
        return activityDetailsRepository.save(activityDetails);
    }

    @Override
    public ActivityDetails updateTransportationMethods(Long id, List<String> transportationMethods) {
        ActivityDetails activityDetails = activityDetailsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Activity details not found"));
        activityDetails.setTransportationMethods(transportationMethods);
        return activityDetailsRepository.save(activityDetails);
    }

    @Override
    public ActivityDetails updateLowestRateForOnePerson(Long id, int lowestRateForOnePerson) {
        ActivityDetails activityDetails = activityDetailsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Activity details not found"));
        activityDetails.setLowestRateForOnePerson(lowestRateForOnePerson);
        return activityDetailsRepository.save(activityDetails);
    }

    @Override
    public ActivityDetails updatePaymentMethods(Long id, List<String> paymentMethods) {
        ActivityDetails activityDetails = activityDetailsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Activity details not found"));
        activityDetails.setPaymentMethods(paymentMethods);
        return activityDetailsRepository.save(activityDetails);
    }


}
