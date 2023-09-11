package com.het.bookmyshow.Service.ServiceImplementation;


import com.het.bookmyshow.Entity.Theatre;
import com.het.bookmyshow.Repository.TheatreRepository;
import com.het.bookmyshow.Service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreServiceImplementation implements TheatreService {

    @Autowired
    TheatreRepository theatreRepository;
    @Override
    public void addTheatre(Theatre theatre) {
        theatreRepository.save(theatre);
    }

    @Override
    public List<Theatre> getAllTheatre() {
        return theatreRepository.findAll();
    }

    @Override
    public List<Theatre> getAllTheatreByCity(String city) {
        return theatreRepository.findByTheatreLocationIdCity(city);
    }
}
