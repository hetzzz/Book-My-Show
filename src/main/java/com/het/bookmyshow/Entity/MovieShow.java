package com.het.bookmyshow.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class MovieShow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer showId;
    private Date showDate;
    private LocalTime startTime;
    private LocalTime endTime;

    @OneToOne
    @JoinColumn(name = "show_screen_id")
    private Screen showScreenId;

    @OneToOne
    @JoinColumn(name = "movie_id")
    private Movie movieId;

}
