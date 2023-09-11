package com.het.bookmyshow.Service.ServiceImplementation;


import com.het.bookmyshow.Entity.MovieShow;
import com.het.bookmyshow.Repository.MovieShowRepository;
import com.het.bookmyshow.Service.MovieShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieShowServiceImplementation implements MovieShowService {

    @Autowired
    MovieShowRepository movieShowRepository;
    @Override
    public void addShow(MovieShow movieShow) {
        movieShowRepository.save(movieShow);
    }
}
