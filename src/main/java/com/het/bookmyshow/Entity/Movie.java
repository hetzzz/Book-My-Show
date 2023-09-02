package com.het.bookmyshow.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
    private Integer movieId;
    private String title;
    private String genre;
    private String description;
    private String language;
    private Date releaseDate;
    private Integer rating;
    @OneToMany(mappedBy = "movies")
    private List<Comments> comments;

}
