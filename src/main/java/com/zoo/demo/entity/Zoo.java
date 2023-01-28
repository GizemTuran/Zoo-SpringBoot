package com.zoo.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Zoo")
public class Zoo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    public Long id;
    public String name;
    public String city;

    public Zoo() {

    }
    public Zoo(Long id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

