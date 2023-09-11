package com.het.bookmyshow.Repository;

import com.het.bookmyshow.Entity.ScreenSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreenSeatRepository extends JpaRepository<ScreenSeat,Integer> {
}
