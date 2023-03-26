package com.touristguidesystem.TouristGuideSystem.repo;

import com.touristguidesystem.TouristGuideSystem.entity.Hotel;
import com.touristguidesystem.TouristGuideSystem.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {


}
