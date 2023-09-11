package com.het.bookmyshow.Repository;


import com.het.bookmyshow.Entity.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre,Integer> {

    List<Theatre> findByTheatreLocationIdCity(String city);

}
