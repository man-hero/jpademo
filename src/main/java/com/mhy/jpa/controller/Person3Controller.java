package com.mhy.jpa.controller;


import com.mhy.jpa.bean.Person;
import com.mhy.jpa.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person3")
public class Person3Controller {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("getPerson/{name}")
    public Person getPerson(@PathVariable String name) {
        return personRepository.getPerson(name);
    }

    @GetMapping("login/{name}/{password}")
    public Person login(@PathVariable String name,@PathVariable String password) {
        return personRepository.login(name, password);
    }

    @GetMapping("getNamesLike/{name}")
    public List<Person> getNamesLike(@PathVariable String name) {
        return personRepository.getNamesLike(name);
    }

    @GetMapping("getPasswordisFive")
    public List<Person> getPasswordisFive() {
        return personRepository.getPasswordisFive();
    }

    @PutMapping(path="updateName/{id}/{name}")
    public int updateName(@PathVariable Long id,@PathVariable String name) {
        return personRepository.UpdateName(id,name);
    }

    @DeleteMapping(path="deleteName/{name}")
    public int DeleteName(@PathVariable String name) {
        return personRepository.DeleteName(name);
    }

}