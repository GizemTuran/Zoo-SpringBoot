package com.zoo.demo.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "Animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    public Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "zoo_id")
    public Zoo ZooId;
    public String species;
    public Integer capacity;
    public Integer age;

    public Animal() {
    }

    public Animal(Long id, Zoo zooId, String species, Integer capacity, Integer age) {
        this.id = id;
        ZooId = zooId;
        this.species = species;
        this.capacity = capacity;
        this.age = age;
    }

    public Animal(Zoo zooId, String species, Integer capacity, Integer age) {
        ZooId = zooId;
        this.species = species;
        this.capacity = capacity;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Zoo getZooId() {
        return ZooId;
    }

    public void setZooId(Zoo zooId) {
        ZooId = zooId;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
