package com.homework6.restapi.repository;

import com.homework6.restapi.model.Speciality;
import com.homework6.restapi.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VisitRepository extends JpaRepository<Visit, Integer> {
    List<Visit> findAll();

    List<Visit> findAllByPatientCnpAndDoctorSpeciality(String cnp, Speciality speciality);
}
