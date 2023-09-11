package com.het.bookmyshow.Controller;

import com.het.bookmyshow.Entity.Movie;
import com.het.bookmyshow.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {


    @Autowired
    MovieService movieService;
    @GetMapping("/getMovies")
    public List<Movie> getMovies(){
        List<Movie> movies = movieService.getAllMovies();
        return movies;
    }

    @PostMapping("/saveMovie")
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
        movieService.addMovie(movie);
        return new ResponseEntity(movie, HttpStatus.CREATED);
    }


}
