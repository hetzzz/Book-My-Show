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
public class ScreenSeat {
    @Id
    private Integer screenSeatId;
    private String seatRow;
    private Integer seatNo;

    @ManyToOne
    @JoinColumn(name = "screen_Id")
    private Screen screenId;

    @OneToMany(mappedBy = "screenSeatId")
    private List<MovieShowSeat> movieShowSeatId;
}
