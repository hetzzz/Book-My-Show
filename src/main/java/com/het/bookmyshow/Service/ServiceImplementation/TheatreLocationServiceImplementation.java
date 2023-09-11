package com.het.bookmyshow.Service.ServiceImplementation;

import com.het.bookmyshow.Entity.TheatreLocation;
import com.het.bookmyshow.Repository.TheatreLocationRepository;
import com.het.bookmyshow.Service.TheatreLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheatreLocationServiceImplementation implements TheatreLocationService {
    @Autowired
    TheatreLocationRepository theatreLocationRepository;
    @Override
    public void addTheatreLocation(TheatreLocation theatreLocation) {
        theatreLocationRepository.save(theatreLocation);
    }
}
