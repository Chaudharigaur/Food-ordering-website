package com.Gaurav.QuickByte.Food.ordering.system.model;

import com.Gaurav.QuickByte.Food.ordering.system.Dto.RestaurantDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Users {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String Email;
    private String password;
    private USER_ROLE role;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "customer")
    private List<Orders> order=new ArrayList<>();

    @ElementCollection
    private List<RestaurantDto>favourite=new ArrayList<>();


    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Address> address=new ArrayList<>();
    private String status;



}
