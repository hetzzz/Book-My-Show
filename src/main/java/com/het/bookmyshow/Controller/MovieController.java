package com.het.bookmyshow.Controller;

import com.het.bookmyshow.Entity.Movie;
import com.het.bookmyshow.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieRepository movieRepository;
    @GetMapping("/getMovies")
    public List<Movie> addMovie(){
        return movieRepository.findAll();
    }


}
