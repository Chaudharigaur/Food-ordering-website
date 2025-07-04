package com.Gaurav.QuickByte.Food.ordering.system.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Users owner;

    private String name;

    private String description;
    private String cuisineType;

    @OneToOne
    private Address address;

    @Embedded
    private  ContactInformation contactInformation;

    private String openingHour;
    private String reviews;

    @OneToMany(mappedBy = "restaurant" ,cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Orders> orders=new ArrayList<>();

    private Long numRating;

    @ElementCollection
    @Column(length=1000)
    private List<String> images;

    private LocalDateTime registarationDate;
    private boolean open;

    @JsonIgnore
    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL)
    private List<Food> foods=new ArrayList<>();


}
