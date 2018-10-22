package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AppController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public Optional<Person> getPersonById(@RequestParam(name ="id") String id) {
        return personRepository.findById(id);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<Person> getPersons() {
        return personRepository.findAll();
    }
}