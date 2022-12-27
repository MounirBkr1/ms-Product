package com.ensa.msproduct.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(name = "firstname", nullable = false,length =10)
    private String designation;

    private Double price;

    private String photo;

    private Long depositQuantity;

    private Date exprirationDate;

    private String shortDescription;





}
