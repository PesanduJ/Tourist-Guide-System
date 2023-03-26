package com.touristguidesystem.TouristGuideSystem.dto;

import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class RestaurantDetailsDTO {
    private Long id;
    private String name;
    private String address;
    private String openingHours;
    private String phoneNo;
    private String email;
    private String password;
    private byte[] photo;
    private List<String> languages;
    private List<String> mealsServed;
    private List<String> paymentMethods;
    private List<String> parking;
    private List<String> atmosphere;
    private List<String> additional;
}
