package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class MovieCinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dateTime;

    @ManyToOne
    private Cinema cinema;

    @ManyToOne
    private Movie movie;

    public MovieCinema(LocalDateTime dateTime, Cinema cinema, Movie movie) {
        this.dateTime = dateTime;
        this.cinema = cinema;
        this.movie = movie;
    }
}
