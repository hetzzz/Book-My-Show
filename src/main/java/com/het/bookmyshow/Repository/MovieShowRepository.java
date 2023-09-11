package com.het.bookmyshow.Repository;


import com.het.bookmyshow.Entity.MovieShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieShowRepository extends JpaRepository<MovieShow,Integer> {

}
