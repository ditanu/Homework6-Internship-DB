package com.homework6.restapi.repository;

import com.homework6.restapi.model.Doctor;
import com.homework6.restapi.model.Patient;
import com.homework6.restapi.model.Speciality;
import com.homework6.restapi.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
    List<Patient> findAll();

    Patient getById(Integer id);

    List<Patient> getAllByDoctor(Doctor doctor);

    Patient getByCnp(String cnp);

}
