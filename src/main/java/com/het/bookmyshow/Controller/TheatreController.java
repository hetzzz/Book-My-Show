package com.het.bookmyshow.Controller;


import com.het.bookmyshow.Entity.Theatre;
import com.het.bookmyshow.Service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TheatreController {
    @Autowired
    TheatreService theatreService;

    @PostMapping("/addTheatre")
    public void addTheatre(@RequestBody Theatre theatre){
        System.out.println(theatre);
        theatreService.addTheatre(theatre);
    }


    @GetMapping("/getAllTheatres")
    public List<Theatre> getTheatre(){
        return theatreService.getAllTheatre();
    }

    @GetMapping("/getTheatresByLocation/{city}")
    public List<Theatre> getTheatreByCity(@PathVariable String city){
        return theatreService.getAllTheatreByCity(city);
    }

}
