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
public class Comments {
    @Id
    private String CommentId;
    private String comment;
    @ManyToOne(optional = false)
    @JoinColumn(name = "movie_id")
    private Movie movies;

}
