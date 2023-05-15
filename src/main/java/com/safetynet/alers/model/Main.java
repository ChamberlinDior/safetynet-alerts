package com.safetynet.alers.model;

import com.safetynet.alers.model.Model.FireStation;
import com.safetynet.alers.model.Model.MedicalRecord;
import com.safetynet.alers.model.Model.Person;
import com.safetynet.alers.model.service.FireStationServiceImpl;
import com.safetynet.alers.model.service.IFireStationService;
import com.safetynet.alers.model.service.IMedicalRecordService;
import com.safetynet.alers.model.service.IPersonService;
import javassist.NotFoundException;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NotFoundException, SQLException {

        // Connexion à la base de données
       com.safetynet.alers.model.Database database = new com.safetynet.alers.model.Database("jdbc:mysql://localhost:3308/safetynet_alerts?useUnicode=true&characterEncoding=UTF-8", "root", "root");
        Connection connection = database.getConnection();

        // Création du service des personnes et chargement des données
        IPersonService personService = new PersonServiceImpl(connection);
        personService.loadData("data/data.json");

        // Création de la liste des casernes des pompiers et chargement des données
        List<FireStation> fireStations = new ArrayList<>();
        IFireStationService fireStationService = new FireStationServiceImpl(connection, fireStations);
        fireStationService.loadData("data/data.json");

        // Création du service des dossiers médicaux et chargement des données
        IMedicalRecordService medicalRecordService = new MedicalRecordServiceImpl(connection);
        medicalRecordService.loadData("data/data.json");

        // Utilisation des services
        // ...


        // Création de quelques instances de classes
        Person person1 = new Person("John", "Doe", "123 Main St", "Springfield", "12345", "555-1234", "johndoe@email.com");
        Person person2 = new Person("Jane", "Doe", "456 Oak St", "Springfield", "12345", "555-5678", "janedoe@email.com");
        FireStation fireStation1 = new FireStation("1", "123 Main St");
        FireStation fireStation2 = new FireStation("2", "456 Oak St");
        MedicalRecord medicalRecord1 = new MedicalRecord("John", "Doe", "01/01/1980", Arrays.asList("penicillin"), Arrays.asList("nuts"));
        MedicalRecord medicalRecord2 = new MedicalRecord("Jane", "Doe", "01/01/1985", Arrays.asList("ibuprofen"), null);



        // Ajout des personnes, casernes et dossiers médicaux
        personService.addPerson(person1);
        personService.addPerson(person2);
        fireStationService.addFireStation(fireStation1);
        fireStationService.addFireStation(fireStation2);
        medicalRecordService.addMedicalRecord(medicalRecord1);
        medicalRecordService.addMedicalRecord(medicalRecord2);

        // Récupération des personnes vivant à l'adresse de la caserne 1
        List<Person> personsAtFireStation1 = fireStationService.getPersonsAtFireStation("1");
        if (personsAtFireStation1 != null) {
            System.out.println("Persons at FireStation 1:");
            for (Person person : personsAtFireStation1) {
                System.out.println(person);
            }
        } else {
            System.out.println("No persons found at FireStation 1");
        }


        // Récupération des personnes couvertes par la caserne 2


        List<Person> personsCoveredByFireStation2 = fireStationService.getPersonsCoveredByFireStation("2");
        if (personsCoveredByFireStation2 != null) {
            System.out.println("Persons covered by FireStation 2:");
            for (Person person : personsCoveredByFireStation2) {
                System.out.println(person);
            }
        } else {
            System.out.println("No persons found covered by FireStation 2");
        }


        // Récupération du dossier médical de John Doe
        MedicalRecord johnDoeMedicalRecord = medicalRecordService.getMedicalRecord("John", "Doe");
        System.out.println("John Doe's Medical Record:");
        System.out.println(johnDoeMedicalRecord);
    }

    private record PersonServiceImpl(Connection connection) implements IPersonService {
        @Override
        public List<Person> getPersons() {
            return null;
        }

        @Override
        public Person getPerson(String firstName, String lastName) {
            return null;
        }

        @Override
        public Person addPerson(Person person) {
            return null;
        }

        @Override
        public Person updatePerson(Person person) {
            return null;
        }

        @Override
        public void deletePerson(String firstName, String lastName) {

        }

        @Override
        public void loadData(String s) {

        }
    }
}
