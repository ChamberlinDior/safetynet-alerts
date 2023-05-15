package com.safetynet.alers.model;

import com.safetynet.alers.model.Model.MedicalRecord;
import com.safetynet.alers.model.service.IMedicalRecordService;
import javassist.NotFoundException;

import java.util.List;

public record MedicalRecordServiceImpl(java.sql.Connection connection) implements IMedicalRecordService {
    @Override
    public List<MedicalRecord> getMedicalRecords() {
        return null;
    }

    @Override
    public MedicalRecord getMedicalRecord(String firstName, String lastName) throws NotFoundException {
        return null;
    }

    @Override
    public MedicalRecord addMedicalRecord(MedicalRecord medicalRecord) {
        return null;
    }

    @Override
    public MedicalRecord updateMedicalRecord(MedicalRecord medicalRecord) {
        return null;
    }

    @Override
    public void deleteMedicalRecord(String firstName, String lastName) {

    }

    @Override
    public void loadData(String s) {

    }
}
