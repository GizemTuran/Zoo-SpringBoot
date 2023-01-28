package com.zoo.demo.service;

import com.zoo.demo.entity.Zoo;
import com.zoo.demo.entity.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZooServiceImp implements ZooService {

    @Autowired
    private ZooRepository zooRepository;

    @Override
    public Optional<Zoo> findById(Long id) {
        Optional<Zoo> zoo =zooRepository.findById(id);
        return zoo;
    }

    @Override
    public List<Zoo> findAll() {
        List<Zoo> list =zooRepository.findAll();
        return list;
    }

    @Override
    public String addZoo(Zoo zoo) {
        Optional<Zoo> zoo1 = zooRepository.findByName(zoo.getName());
        if (zoo1.isPresent()){
            return "Zoo already exist.";
        }
        else {
            zooRepository.save(zoo);
            return "Zoo added successfully.";
        }
    }

    @Override
    public String updateZoo(Zoo zoo) {
        Optional<Zoo> zoodb= zooRepository.findById(zoo.getId());
        if(zoodb!=null){
            zoodb.get().setName(zoo.getName());
            zoodb.get().setCity(zoo.getCity());
            zooRepository.save(zoodb.get());

            return("Product updated");
        }
        else {
            return ("Product doesn't exist");
        }
    }

    @Override
    public String deleteZoo(Long zooId) {

        Optional<Zoo> zoo1 = zooRepository.findById(zooId);

        if(zoo1!=null){
            zooRepository.deleteById(zooId);
            return "Deleted successfully!";
        }
        else {
            return "Not found";
        }
    }
}
