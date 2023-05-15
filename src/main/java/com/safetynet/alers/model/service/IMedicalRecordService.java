package com.safetynet.alers.model.service;

import com.safetynet.alers.model.Model.MedicalRecord;
import javassist.NotFoundException;

import java.util.List;

public interface IMedicalRecordService {

    List<MedicalRecord> getMedicalRecords();

    MedicalRecord getMedicalRecord(String firstName, String lastName) throws NotFoundException;

    MedicalRecord addMedicalRecord(MedicalRecord medicalRecord);

    MedicalRecord updateMedicalRecord(MedicalRecord medicalRecord);

    void deleteMedicalRecord(String firstName, String lastName);

    void loadData(String s);
}