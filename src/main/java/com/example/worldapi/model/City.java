package com.example.worldapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "CountryCode", nullable = false)
    private String countryCode;

    @Column(name = "District", nullable = false)
    private String district;

    @Column(name = "Population", nullable = false)
    private int population;
}
