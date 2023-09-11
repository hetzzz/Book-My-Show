package com.het.bookmyshow.Service.ServiceImplementation;


import com.het.bookmyshow.Entity.Screen;
import com.het.bookmyshow.Repository.ScreenRepository;
import com.het.bookmyshow.Service.ScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScreenServiceImplementation implements ScreenService {

    @Autowired
    ScreenRepository screenRepository;
    @Override
    public void addScreen(Screen screen) {
        screenRepository.save(screen);
    }
}
