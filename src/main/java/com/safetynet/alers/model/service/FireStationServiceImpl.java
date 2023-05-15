package com.safetynet.alers.model.service;

import com.safetynet.alers.model.Model.FireStation;
import com.safetynet.alers.model.Model.Person;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.util.List;

public class FireStationServiceImpl implements IFireStationService {

    @Autowired
    private List<FireStation> fireStations;

    public FireStationServiceImpl(Connection connection, List<FireStation> fireStations) {
        this.fireStations = fireStations;
    }

    @Override
    public List<FireStation> getFireStations() {
        return fireStations;
    }

    @Override
    public FireStation getFireStationByAddress(String address) throws NotFoundException {
        return fireStations.stream()
                .filter(f -> f.getAddress().equals(address))
                .findFirst()
                .orElseThrow(() -> new NotFoundException("Fire station not found"));
    }

    @Override
    public FireStation addFireStation(FireStation fireStation) {
        if (fireStation == null) {
            throw new IllegalArgumentException("Fire station cannot be null");
        }
        if (fireStations.contains(fireStation)) {
            throw new IllegalArgumentException("Fire station already exists");
        }
        fireStations.add(fireStation);
        return fireStation;
    }
    // FireStationServiceImpl.java (suite)
    @Override
    public FireStation updateFireStation(FireStation fireStation) throws NotFoundException {
        FireStation existingFireStation = getFireStationByAddress((String) fireStation.getAddress());
        existingFireStation.setNumber(fireStation.getNumber());
        return existingFireStation;
    }

    @Override
    public void deleteFireStation(String address) throws NotFoundException {
        FireStation fireStation = getFireStationByAddress(address);
        fireStations.remove(fireStation);
    }

    @Override
    public List<Person> getPersonsCoveredByFireStation(String s) {
        return null;
    }

    @Override
    public List<Person> getPersonsAtFireStation(String s) {
        return null;
    }

    @Override
    public void loadData(String s) {

    }

}