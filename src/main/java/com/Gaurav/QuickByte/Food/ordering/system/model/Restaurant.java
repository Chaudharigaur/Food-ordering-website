package com.Gaurav.QuickByte.Food.ordering.system.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String owner;
    private String description;
    private String cuisineType;
    private List<String> address;
    private Long contactInformation;
    private Date openingHour;
    private String reviews;
    private String orders;
    private Long numRating;
    private byte[] images;
    private Date registarationDate;
    private boolean open;
    private String foods;


}
