package com.cydeo.entity;

import com.cydeo.enums.State;
import com.cydeo.enums.Type;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;
@Entity
@Data
@NoArgsConstructor
public class Movie {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String name;
   private Double price;
   private Type type;
   private State state;
   private LocalDate releaseDate;
   private LocalTime duration;
   private String summary;

   public Movie(String name, Double price, Type type, State state, LocalDate releaseDate,
                LocalTime duration, String summary) {
      this.name = name;
      this.price = price;
      this.type = type;
      this.state = state;
      this.releaseDate = releaseDate;
      this.duration = duration;
      this.summary = summary;
   }
}
