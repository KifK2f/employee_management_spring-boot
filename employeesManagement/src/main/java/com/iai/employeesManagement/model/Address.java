package com.iai.employeesManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class Address {
    @Column(name = "pays" , nullable = false)
    private String country;

    @Column(name = "ville", nullable = false)
    private String town;

    @Column(name = "rue", nullable = false)
    private String Street;

    public Address(String country, String town, String street) {
        this.country = country;
        this.town = town;
        Street = street;
    }
}
