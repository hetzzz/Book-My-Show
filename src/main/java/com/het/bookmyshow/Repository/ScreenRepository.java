package com.het.bookmyshow.Repository;


import com.het.bookmyshow.Entity.Screen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreenRepository extends JpaRepository<Screen,Integer> {
}
