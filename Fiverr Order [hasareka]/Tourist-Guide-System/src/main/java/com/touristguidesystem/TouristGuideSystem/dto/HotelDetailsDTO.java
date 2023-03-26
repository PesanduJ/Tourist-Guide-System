package com.touristguidesystem.TouristGuideSystem.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class HotelDetailsDTO {

        private Long id;
        private String name;
        private String address;
        private String description;
        private String phoneNo;
        private String email;
        private String password;
        private byte[] photo;
        private List<String> languages;
        private List<String> facilities;
        private List<String> services;
        private List<String> mostCommonAmenities;
        private List<String> otherAmenities;

}
