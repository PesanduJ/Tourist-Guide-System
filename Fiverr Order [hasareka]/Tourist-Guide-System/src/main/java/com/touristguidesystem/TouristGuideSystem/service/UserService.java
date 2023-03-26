package com.touristguidesystem.TouristGuideSystem.service;

import com.touristguidesystem.TouristGuideSystem.entity.Address;
import com.touristguidesystem.TouristGuideSystem.entity.User;

import java.util.List;

public interface UserService {
    User addUser(User user);

    List<User> getAllUsers();


    User getUserById(Long id);
    User updateUserFirstName(Long id, String firstName);
    User updateUserLastName(Long id, String lastName);
    User updateUserEmail(Long id, String email);
    User updateUserPhoneNo(Long id, String phoneNo);
    User updateUserGender(Long id, String gender);
    User updateUserAddress(Long userId, Long addressId, Address updatedAddress);

}
