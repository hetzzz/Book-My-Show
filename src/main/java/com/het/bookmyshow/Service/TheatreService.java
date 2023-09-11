package com.het.bookmyshow.Service;

import com.het.bookmyshow.Entity.Theatre;

import java.util.List;

public interface TheatreService {
    public void addTheatre(Theatre theatre);

    public List<Theatre>  getAllTheatre();
    public List<Theatre>  getAllTheatreByCity(String city);
}
