package com.homework6.restapi.repository;

import com.homework6.restapi.model.Doctor;
import com.homework6.restapi.model.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    List<Doctor> findAll();

    Doctor getById(Integer id);

    List<Doctor> getAllBySpeciality(Speciality speciality);
}
