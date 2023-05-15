package com.safetynet.alers.model.service;

import com.safetynet.alers.model.Model.Person;

import java.util.List;

public interface IPersonService {

    List<Person> getPersons();

    Person getPerson(String firstName, String lastName);

    Person addPerson(Person person);

    Person updatePerson(Person person);

    default void deletePerson(String firstName, String lastName) {

    }

    void loadData(String s);
}
