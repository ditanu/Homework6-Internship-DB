package com.homework6.restapi.service;

import com.homework6.restapi.exceptions.NoDoctorException;
import com.homework6.restapi.repository.DoctorRepository;
import com.homework6.restapi.repository.PatientRepository;
import com.homework6.restapi.model.Doctor;
import com.homework6.restapi.model.Patient;
import com.homework6.restapi.model.Speciality;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public void addPatient(Integer doctorId, Integer patientId) throws NoDoctorException {
        Doctor d = doctorRepository.getById(doctorId);
        if (d == null)
            throw new NoDoctorException();
        else {
            Patient p = patientRepository.getById(patientId);
            if (p != null) {
                d.addPatient(p);
            }
        }
    }

    public void addDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    public List<Doctor> getAllBySpecialty(Speciality speciality) {
        return doctorRepository.getAllBySpeciality(speciality);
    }

}
