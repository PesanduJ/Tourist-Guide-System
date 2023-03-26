package com.touristguidesystem.TouristGuideSystem.repo;

import com.touristguidesystem.TouristGuideSystem.entity.Tables;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepository extends JpaRepository<Tables, Long> {
}
