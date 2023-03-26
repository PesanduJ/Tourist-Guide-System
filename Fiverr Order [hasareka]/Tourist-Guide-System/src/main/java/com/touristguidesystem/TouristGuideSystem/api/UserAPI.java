package com.touristguidesystem.TouristGuideSystem.api;


import com.touristguidesystem.TouristGuideSystem.dto.UserDTO;
import com.touristguidesystem.TouristGuideSystem.entity.Address;
import com.touristguidesystem.TouristGuideSystem.entity.User;
import com.touristguidesystem.TouristGuideSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserAPI {

    @Autowired
    private UserService userService;


    @PostMapping("/addUser")
    public User addUser(@RequestBody UserDTO userDTO){
        return userService.addUser(userDTO.getUser());
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PatchMapping("/updateUserFirstName/{id}")
    public User updateUserFirstName(@PathVariable Long id, @RequestParam String firstName) {
        return userService.updateUserFirstName(id, firstName);
    }

    @PatchMapping("/updateUserLastName/{id}")
    public User updateUserLastName(@PathVariable Long id, @RequestParam String lastName) {
        return userService.updateUserLastName(id, lastName);
    }

    @PatchMapping("/updateUserEmail/{id}")
    public User updateUserEmail(@PathVariable Long id, @RequestParam String email) {
        return userService.updateUserEmail(id, email);
    }

    @PatchMapping("/updateUserPhoneNo/{id}")
    public User updateUserPhoneNo(@PathVariable Long id, @RequestParam String phoneNo) {
        return userService.updateUserPhoneNo(id, phoneNo);
    }

    @PatchMapping("/updateUserGender/{id}")
    public User updateUserGender(@PathVariable Long id, @RequestParam String gender) {
        return userService.updateUserGender(id, gender);
    }

    @PatchMapping("/updateUserAddress/{userId}/addresses/{addressId}")
    public User updateUserAddress(@PathVariable Long userId, @PathVariable Long addressId, @RequestBody Address updatedAddress) {
        return userService.updateUserAddress(userId, addressId, updatedAddress);
    }

}
