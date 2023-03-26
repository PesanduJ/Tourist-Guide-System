package com.touristguidesystem.TouristGuideSystem.repo;

import com.touristguidesystem.TouristGuideSystem.entity.Hotel;
import com.touristguidesystem.TouristGuideSystem.entity.Location;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

}
