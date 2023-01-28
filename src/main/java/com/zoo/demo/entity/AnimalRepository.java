package com.zoo.demo.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal,Long> {

    @Query("select a from Animal as a where a.species=:species")
    Animal findBySpecies(@Param("species")String species);

    @Query("select a from  Animal AS a where a.ZooId.name=:zooName")
    List<Animal> findAllFromZoo(@Param("zooName")String zooName);
}
