package com.safetynet.alers.model.service;

import com.safetynet.alers.model.Model.FireStation;
import com.safetynet.alers.model.Model.Person;
import javassist.NotFoundException;

import java.util.List;

public interface IFireStationService {

    List<FireStation> getFireStations();

    FireStation getFireStationByAddress(String address) throws NotFoundException;

    FireStation addFireStation(FireStation fireStation);

    FireStation updateFireStation(FireStation fireStation) throws NotFoundException;

    void deleteFireStation(String address) throws NotFoundException;

    List<Person> getPersonsCoveredByFireStation(String s);

    List<Person> getPersonsAtFireStation(String s);

    void loadData(String s);
}