package com.het.bookmyshow.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Comments {
    @Id
    @GeneratedValue
    private Integer CommentId;
    private String comment;
    @ManyToOne(optional = false)
    @JoinColumn(name = "movie_id")
    @JsonBackReference
    private Movie movies;

}
