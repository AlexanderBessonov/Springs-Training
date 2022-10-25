package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String sponsoredName;

    @ManyToOne
    private Location location;

    public Cinema(String name, String sponsoredName, Location location) {
        this.name = name;
        this.sponsoredName = sponsoredName;
        this.location = location;
    }
}
