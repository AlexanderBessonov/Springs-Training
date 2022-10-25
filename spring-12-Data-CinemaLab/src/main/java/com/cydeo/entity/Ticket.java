package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dateTime;
    private int seatNumber;
    private int rowNumber;

    @ManyToOne
    private UserAccount userAccount;

    @ManyToOne
    private MovieCinema movieCinema;

    public Ticket(LocalDateTime dateTime, int seatNumber, int rowNumber, UserAccount userAccount, MovieCinema movieCinema) {
        this.dateTime = dateTime;
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.userAccount = userAccount;
        this.movieCinema = movieCinema;
    }
}
