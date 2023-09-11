package com.het.bookmyshow.Controller;

import com.het.bookmyshow.Entity.MovieShow;
import com.het.bookmyshow.Service.MovieShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieShowController {

    @Autowired
    MovieShowService movieShowService;


    @PostMapping("/addShow")
    public void addShow(@RequestBody MovieShow movieShow){
        movieShowService.addShow(movieShow);
    }




}
