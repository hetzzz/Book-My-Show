package com.het.bookmyshow.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer movieId;
    private String title;
    private String genre;
    private String description;
    private String language;
    private Date releaseDate;
    private Integer rating;
    @OneToMany(mappedBy = "movies")
//    @JsonBackReference
    private List<Comments> comments;

}
