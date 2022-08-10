package com.homework6.restapi.service;

import com.homework6.restapi.model.Doctor;
import com.homework6.restapi.model.Patient;
import com.homework6.restapi.repository.PatientRepository;
import com.homework6.restapi.repository.VisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    private final VisitRepository visitRepository;

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public List<Patient> getAllByDoctor(Doctor doctor) {
        return patientRepository.getAllByDoctor(doctor);
    }

    public void savePatient(Patient patient) {
        patientRepository.save(patient);
    }

    public Patient getPatientByCnp(String cnp) {
        return patientRepository.getByCnp(cnp);
    }

}