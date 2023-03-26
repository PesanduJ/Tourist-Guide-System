package com.touristguidesystem.TouristGuideSystem.service;

import com.touristguidesystem.TouristGuideSystem.entity.Address;
import com.touristguidesystem.TouristGuideSystem.entity.User;
import com.touristguidesystem.TouristGuideSystem.repo.AddressRepository;
import com.touristguidesystem.TouristGuideSystem.repo.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceIMPL implements UserService{


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User updateUserFirstName(Long id, String firstName) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setFirstName(firstName);
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public User updateUserLastName(Long id, String lastName) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setLastName(lastName);
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public User updateUserEmail(Long id, String email) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setEmail(email);
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public User updateUserPhoneNo(Long id, String phoneNo) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setPhoneNo(phoneNo);
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public User updateUserGender(Long id, String gender) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setGender(gender);
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public User updateUserAddress(Long userId, Long addressId, Address updatedAddress) {
        User user = userRepository.findById(userId).orElseThrow(() -> new EntityNotFoundException("User not found"));
        Address address = addressRepository.findById(addressId).orElseThrow(() -> new EntityNotFoundException("Address not found"));

        // Update address fields
        address.setAddress(updatedAddress.getAddress());
        address.setCity(updatedAddress.getCity());
        address.setCountry(updatedAddress.getCountry());

        // Save updated address
        addressRepository.save(address);

        // Update user's address list
        List<Address> addresses = user.getAddress();
        for (int i = 0; i < addresses.size(); i++) {
            if (addresses.get(i).getId().equals(addressId)) {
                addresses.set(i, address);
                break;
            }
        }

        // Save updated user
        user.setAddress(addresses);
        userRepository.save(user);

        return user;
    }
}
