package com.het.bookmyshow.Repository;


import com.het.bookmyshow.Entity.TheatreLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreLocationRepository extends JpaRepository<TheatreLocation,Integer> {
}
