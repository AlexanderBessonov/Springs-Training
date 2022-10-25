package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double latitude;
    private double longitude;
    private String country;
    private String city;
    private String state;
    private String postalCode;
    private String address;

    @OneToMany
    private Cinema cinema;

    public Location(String name, double latitude, double longitude, String country, String city,
                    String state, String postalCode, String address, Cinema cinema) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.country = country;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.address = address;
        this.cinema = cinema;
    }
}
