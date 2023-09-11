package com.het.bookmyshow.Service;

import com.het.bookmyshow.Entity.Movie;

import java.util.List;

public interface MovieService {

    public Movie addMovie (Movie movie);
    public List<Movie> getAllMovies();

}
