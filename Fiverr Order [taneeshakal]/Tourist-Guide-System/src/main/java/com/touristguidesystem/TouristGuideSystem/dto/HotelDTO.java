package com.touristguidesystem.TouristGuideSystem.dto;

import com.touristguidesystem.TouristGuideSystem.entity.Hotel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HotelDTO {
    private Hotel hotel;
}
