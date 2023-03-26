package com.touristguidesystem.TouristGuideSystem.entity;


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
@Entity
public class ActivityDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;

    private String tourDuration;

    private String phoneNo;
    private String email;
    private String password;

    @Lob
    private byte[] photo;

    @ElementCollection
    private List<String> languages;

    @ElementCollection
    private List<String> services;

    @ElementCollection
    private List<String> mealsProvided;

    @ElementCollection
    private List<String> transportationMethods;

    private int lowestRateForOnePerson;

    @ElementCollection
    private List<String> paymentMethods;
}
