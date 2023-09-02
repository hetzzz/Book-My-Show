package com.het.bookmyshow.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class MovieShowSeat {
    @Id
    private Integer showSeatId;
    private Boolean status;
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "screen_seat_id")
    private ScreenSeat screenSeatId;

    @ManyToOne
    @JoinColumn(name = "movie_show_id")
    private movieShow movieShowId;

}
