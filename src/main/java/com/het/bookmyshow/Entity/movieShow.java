package com.het.bookmyshow.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class movieShow {
    @Id
    private Integer showId;
    private Date datetime;
    private Date startTime;
    private Date endTime;

    @OneToOne
    @JoinColumn(name = "show_screen_id")
    private Screen showScreenId;

    @OneToOne
    @JoinColumn(name = "movie_id")
    private Movie movieId;

}
