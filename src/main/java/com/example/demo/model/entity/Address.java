package com.example.demo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {

    private int id;

    private String country;

    private String postCode;

    private String city;
}
