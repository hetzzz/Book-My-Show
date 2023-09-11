package com.het.bookmyshow.Service.ServiceImplementation;

import com.het.bookmyshow.Entity.ScreenSeat;
import com.het.bookmyshow.Repository.ScreenSeatRepository;
import com.het.bookmyshow.Service.ScreenSeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScreenSeatServiceImplemenation implements ScreenSeatService {
    @Autowired
    ScreenSeatRepository screenSeatRepository;

    @Override
    public void addSeat(ScreenSeat screenSeat) {
        screenSeatRepository.save(screenSeat);
    }
}
