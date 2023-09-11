package com.het.bookmyshow.Controller;


import com.het.bookmyshow.Entity.Screen;
import com.het.bookmyshow.Service.ScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScreenController {

    @Autowired
    ScreenService screenService;
    @PostMapping("/addScreen")
    public void addScreen(@RequestBody Screen screen){
        screenService.addScreen(screen);
    }


}
