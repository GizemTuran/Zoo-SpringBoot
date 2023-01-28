package com.zoo.demo.controller;

import com.zoo.demo.service.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zoo.demo.entity.Zoo;

import java.util.List;
import java.util.Optional;

@RestController
public class ZooController {
    @Autowired
    private ZooService zooService;

    @GetMapping("/zoo/find/all")
    public List<Zoo> findAll(){
        return zooService.findAll();
    }

    @GetMapping("/zoo/find/{zooId}")
    public Optional<Zoo> findById(@PathVariable("zooId")long zooId){
        return zooService.findById(zooId);
    }
    @PostMapping("/zoo/add")
    public String addZoo(@RequestBody Zoo zoo){
        return zooService.addZoo(zoo);
    }

    @PutMapping("/zoo/update")
    public String updateZoo(@RequestBody Zoo zoo){
        return zooService.updateZoo(zoo);
    }

    @DeleteMapping("/zoo/delete/{zooId}")
    public String deleteZoo(@PathVariable("zooId")long zooId){
        return zooService.deleteZoo(zooId);
    }
}
