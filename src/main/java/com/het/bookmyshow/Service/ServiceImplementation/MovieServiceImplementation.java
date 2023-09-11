package com.het.bookmyshow.Service.ServiceImplementation;

import com.het.bookmyshow.Entity.Movie;
import com.het.bookmyshow.Repository.MovieRepository;
import com.het.bookmyshow.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImplementation implements MovieService {
    @Autowired
    MovieRepository movieRepository;


    public Movie addMovie(Movie movie){
        movieRepository.save(movie);
        return movie;
    }

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

}
