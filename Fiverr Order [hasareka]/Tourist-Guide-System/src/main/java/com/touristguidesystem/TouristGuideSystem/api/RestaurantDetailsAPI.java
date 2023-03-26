package com.touristguidesystem.TouristGuideSystem.api;

import com.touristguidesystem.TouristGuideSystem.dto.ActivityDetailsDTO;
import com.touristguidesystem.TouristGuideSystem.dto.RestaurantDetailsDTO;
import com.touristguidesystem.TouristGuideSystem.entity.ActivityDetails;
import com.touristguidesystem.TouristGuideSystem.entity.RestaurantDetails;
import com.touristguidesystem.TouristGuideSystem.service.RestaurantDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurantDetails")
public class RestaurantDetailsAPI {


    @Autowired
    private RestaurantDetailsService restaurantDetailsService;


    @PostMapping("/addRestaurantDetails")
    public RestaurantDetails addRestaurantDetails(@RequestBody RestaurantDetails restaurantDetails){
        return restaurantDetailsService.addRestaurantDetails(restaurantDetails);
    }

    @GetMapping("/findAllRestaurantDetails")
    public List<RestaurantDetails> getAllRestaurantDetails(){
        return restaurantDetailsService.findAllRestaurantDetails();
    }

    @GetMapping("/findRestaurantDetailsById/{id}")
    public RestaurantDetails getRestaurantDetailsById(@PathVariable Long id){
        return restaurantDetailsService.getRestaurantDetailsById(id);
    }

    @PatchMapping("/updateRestaurantDetailsName/{id}")
    public RestaurantDetails updateName(@PathVariable Long id, @RequestParam String name) {
        return restaurantDetailsService.updateName(id, name);
    }

    @PatchMapping("/updateRestaurantDetailsAddress/{id}")
    public RestaurantDetails updateAddress(@PathVariable Long id, @RequestParam String address) {
        return restaurantDetailsService.updateAddress(id, address);
    }

    @PatchMapping("/updateRestaurantDetailsOpeningHours/{id}")
    public RestaurantDetails updateOpeningHours(@PathVariable Long id, @RequestParam String openingHours) {
        return restaurantDetailsService.updateOpeningHours(id, openingHours);
    }

    @PatchMapping("/updateRestaurantDetailsPhoneNo/{id}")
    public RestaurantDetails updatePhoneNo(@PathVariable Long id, @RequestParam String phoneNo) {
        return restaurantDetailsService.updatePhoneNo(id, phoneNo);
    }

    @PatchMapping("/updateRestaurantDetailsEmail/{id}")
    public RestaurantDetails updateEmail(@PathVariable Long id, @RequestParam String email) {
        return restaurantDetailsService.updateEmail(id, email);
    }

    @PatchMapping("/updateRestaurantDetailsPassword/{id}")
    public RestaurantDetails updatePassword(@PathVariable Long id, @RequestParam String password) {
        return restaurantDetailsService.updatePassword(id, password);
    }

    @PatchMapping("/updateRestaurantDetailsPhoto/{id}")
    public RestaurantDetails updatePhoto(@PathVariable Long id, @RequestParam byte[] photo) {
        return restaurantDetailsService.updatePhoto(id, photo);
    }

    @PatchMapping("/updateRestaurantDetailsLanguages/{id}")
    public RestaurantDetails updateLanguages(@PathVariable Long id, @RequestBody RestaurantDetailsDTO restaurantDetailsDTO) {
        List<String> languages = restaurantDetailsDTO.getLanguages();
        return restaurantDetailsService.updateLanguage(id, languages);
    }

    @PatchMapping("/updateRestaurantDetailsMealsServed/{id}")
    public RestaurantDetails updateMealsServed(@PathVariable Long id, @RequestBody RestaurantDetailsDTO restaurantDetailsDTO) {
        List<String> mealsServed = restaurantDetailsDTO.getMealsServed();
        return restaurantDetailsService.updateMealsServed(id, mealsServed);
    }

    @PatchMapping("/updateRestaurantDetailsPaymentMethods/{id}")
    public RestaurantDetails updatePaymentMethods(@PathVariable Long id, @RequestBody RestaurantDetailsDTO restaurantDetailsDTO) {
        List<String> paymentMethods = restaurantDetailsDTO.getPaymentMethods();
        return restaurantDetailsService.updatePaymentMethods(id, paymentMethods);
    }

    @PatchMapping("/updateRestaurantDetailsParking/{id}")
    public RestaurantDetails updateParking(@PathVariable Long id, @RequestBody RestaurantDetailsDTO restaurantDetailsDTO) {
        List<String> parking = restaurantDetailsDTO.getParking();
        return restaurantDetailsService.updateParking(id, parking);

    }

    @PatchMapping("/updateRestaurantDetailsAtmosphere/{id}")
    public RestaurantDetails updateAtmosphere(@PathVariable Long id, @RequestBody RestaurantDetailsDTO restaurantDetailsDTO) {
        List<String> atmosphere = restaurantDetailsDTO.getAtmosphere();
        return restaurantDetailsService.updateAtmosphere(id, atmosphere);
    }

    @PatchMapping("/updateRestaurantDetailsAdditional/{id}")
    public RestaurantDetails updateAdditional(@PathVariable Long id, @RequestBody RestaurantDetailsDTO restaurantDetailsDTO) {
        List<String> additional = restaurantDetailsDTO.getAdditional();
        return restaurantDetailsService.updateAdditional(id, additional);
    }
}
