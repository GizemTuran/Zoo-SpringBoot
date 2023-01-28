package com.zoo.demo.service;

import com.zoo.demo.entity.Animal;
import com.zoo.demo.entity.Zoo;

import java.util.List;
import java.util.Optional;

public interface ZooService {
    Optional<Zoo> findById(Long zId);
    List<Zoo> findAll();
    String addZoo(Zoo zoo);
    String updateZoo(Zoo zoo);
    String deleteZoo(Long zooId);
}
