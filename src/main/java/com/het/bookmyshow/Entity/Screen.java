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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer screenId;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "theatre_id")
    private Theatre theatreId;

    @OneToMany(mappedBy = "screenId")
    private List<ScreenSeat> screenSeatID;

}
