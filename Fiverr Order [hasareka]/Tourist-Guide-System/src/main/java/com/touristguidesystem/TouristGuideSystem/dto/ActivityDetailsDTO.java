package com.touristguidesystem.TouristGuideSystem.dto;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ActivityDetailsDTO {

    private Long id;
    private String name;
    private String address;
    private String tourDuration;
    private String phoneNo;
    private String email;
    private String password;
    private byte[] photo;
    private List<String> languages;
    private List<String> services;
    private List<String> mealsProvided;
    private List<String> transportationMethods;
    private int lowestRateForOnePerson;
    private List<String> paymentMethods;
}
