package com.het.bookmyshow.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class TheatreLocation {
    @Id
    private Integer locationId;
    private String city;
    private String state;
    private String area;
    private Integer pincode;

}
