package com.het.bookmyshow.Controller;


import com.het.bookmyshow.Entity.TheatreLocation;
import com.het.bookmyshow.Service.TheatreLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheatreLocationController {

    @Autowired
    TheatreLocationService theatreLocationService;

    @PostMapping("/addLocation")
    public void addTheatreLocation(@RequestBody TheatreLocation theatreLocation){

        theatreLocationService.addTheatreLocation(theatreLocation);
    }

}
