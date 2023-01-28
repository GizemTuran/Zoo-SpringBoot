package com.zoo.demo.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ZooRepository extends JpaRepository<Zoo,Long> {

    @Query("select z from Zoo AS z where z.id=:id")
    Optional<Zoo> findById(@Param("id")Long id);

    @Query("select z from Zoo AS z")
    List<Zoo> findAll();

    @Query("select z from Zoo AS z where z.name=:name")
    Optional<Zoo> findByName(@Param("name")String name);
}
