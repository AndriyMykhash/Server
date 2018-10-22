package com.company;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {

    @Override
    Optional<Person> findById(String name);

    @Override
    List<Person> findAll();

}