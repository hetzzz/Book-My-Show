package com.het.bookmyshow.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Theatre {
    @Id
    private Integer theatreID;
    private String theatreName;
    @OneToMany(mappedBy = "theatreId")
    private List<Screen> screensId;
    @ManyToOne
    @JoinColumn(name = "theatre_location_id")
    private TheatreLocation theatreLocationId;

}
