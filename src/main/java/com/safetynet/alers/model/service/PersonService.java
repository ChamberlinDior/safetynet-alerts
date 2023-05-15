package com.safetynet.alers.model.service;

import com.safetynet.alers.model.Model.Person;

import java.util.List;

public interface PersonService {

    List<Person> findAll();

    Person save(Person person);

    void delete(Person person);

    Person findByFirstNameAndLastName(String firstName, String lastName);

    List<Person> findAllByAddress(String address);

    List<Person> findAllByCity(String city);

    List<String> findAllEmailsByCity(String city);

    List<Person> findAllByStationNumber(int stationNumber);
}
