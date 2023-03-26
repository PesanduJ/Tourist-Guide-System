package com.touristguidesystem.TouristGuideSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class RestaurantDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;

    private String openingHours;

    private String phoneNo;
    private String email;
    private String password;

    @Lob
    private byte[] photo;

    @ElementCollection
    private List<String> languages;

    @ElementCollection
    private List<String> mealsServed;

    @ElementCollection
    private List<String> paymentMethods;

    @ElementCollection
    private List<String> parking;

    @ElementCollection
    private List<String> atmosphere;

    @ElementCollection
    private List<String> additional;

}
