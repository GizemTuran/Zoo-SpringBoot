package com.zoo.demo.service;

import com.zoo.demo.entity.Animal;
import com.zoo.demo.entity.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalServiceImp implements AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public String addAnimal(Animal animal) {
        animalRepository.save(animal);
        return "Animal has added successfully.";
    }

    @Override
    public List<Animal> findAll() {
        List<Animal> animal =animalRepository.findAll();
        return animal;
    }

    @Override
    public Animal findById(Long id) {
        try{
            return animalRepository.findById(id).get();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public List<Animal> findAllFromZoo(String zooName) {
        List<Animal> list=animalRepository.findAllFromZoo(zooName);
        return list;
    }

    @Override
    public String updateAnimal(Animal animal) {
//        Optional<Animal> optional = animalRepository.findById(animal.getId());
//        if (optional.isPresent()){
//            Animal animalDb = optional.get();
//            animalDb.setAge(animal.getAge());
//            animalDb.setCapacity(animal.getCapacity());
//            animalDb.setSpecies(animal.getSpecies());
//            animalDb.setSpecies(animal.getSpecies());
//            animalDb.setZooId(animal.getZooId());
//
//            return "Animal updated...";
//        }
//        else {
//            return "Animal doesn't exist.";
//        }

        return animalRepository.save(animal).toString();
    }

    @Override
    public String deleteAnimal(Long animalId) {
        Optional<Animal> animal = animalRepository.findById(animalId);
        if(animal!=null){
            animalRepository.deleteById(animalId);
            return "Deleted successfully.";
        }
        else {
            return "Not found.";

        }
    }
}
