package com.touristguidesystem.TouristGuideSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor             //Lombok annotations - No need to generate Constructors and Getters/Setters
@NoArgsConstructor
@ToString                       //Lombok annotation for get the string representation of a Java object
@Data
@Entity                         //Specifies that the class is an entity and is mapped to a database table
public class Room {
    @Id                        //specifies the primary key of an entity
    @GeneratedValue(strategy = GenerationType.IDENTITY)         //database is responsible to auto generate the primary key
    private Long id;
    private String roomType;
    private String type;

    @Lob                        //specifies that the currently annotated entity attribute represents a large object type
    private String description;
    private int price;

    @Lob                        //specifies that the currently annotated entity attribute represents a large object type
    private String specialFeatures;
}
