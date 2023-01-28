package com.zoo.demo.service;

import com.zoo.demo.entity.Animal;

import java.util.List;
import java.util.Optional;

public interface AnimalService{
    String addAnimal(Animal animal);
    List<Animal> findAll();
    Animal findById(Long id);

    List<Animal> findAllFromZoo(String zooName);

    String updateAnimal(Animal animal);
    String deleteAnimal(Long animalId);
}
