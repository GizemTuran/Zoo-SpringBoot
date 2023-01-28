package com.zoo.demo.controller;

import com.zoo.demo.entity.Animal;
import com.zoo.demo.entity.Zoo;
import com.zoo.demo.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/animal/find/all")
    public List<Animal> findAll(){return animalService.findAll();}

    @GetMapping("/animal/find/{animalId}")
    public Animal findById(@PathVariable("animalId")long animalId){return animalService.findById(animalId);}

    @GetMapping("/animal/find/all/{zooId}")
    public List<Animal> findAllFromZoo(@PathVariable("zooId")String zooId){return animalService.findAllFromZoo(zooId);}

    @PostMapping("/animal/add")
    public String addAnimal(@RequestBody Animal animal){return animalService.addAnimal(animal);}

    @PutMapping("/animal/update")
    public String updateAnimal(@RequestBody Animal animal){
        return animalService.updateAnimal(animal);
    }

    @DeleteMapping("/animal/delete/{animalId}")
    public String deleteAnimal(@PathVariable Animal animal){
        return animalService.deleteAnimal(animal.getId());
    }
}

