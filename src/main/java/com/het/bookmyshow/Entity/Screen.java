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
public class Screen {
    @Id
    private Integer screenId;

    @ManyToOne
    @JoinColumn(name = "theatre_id")
    private Theatre theatreId;

    @OneToMany(mappedBy = "screenId")
    private List<ScreenSeat> screenSeatID;

}
