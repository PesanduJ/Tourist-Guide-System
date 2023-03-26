package com.touristguidesystem.TouristGuideSystem.repo;

import com.touristguidesystem.TouristGuideSystem.entity.Activity;
import com.touristguidesystem.TouristGuideSystem.entity.ActivityCenter;
import com.touristguidesystem.TouristGuideSystem.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityCenterRepository extends JpaRepository<ActivityCenter, Long> {

}
