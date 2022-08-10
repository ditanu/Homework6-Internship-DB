package com.homework6.restapi.controller;

import com.homework6.restapi.exceptions.NoDoctorException;
import com.homework6.restapi.model.Doctor;
import com.homework6.restapi.model.Speciality;
import com.homework6.restapi.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("doctors")
public class DoctorController {
    private final DoctorService doctorService;

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @PostMapping("/{doctorId}/{patientId}")
    public void addPatient(@PathVariable("doctorId") Integer doctorId, @PathVariable("patientId") Integer patientId) throws NoDoctorException {
        doctorService.addPatient(doctorId, patientId);
    }

    @GetMapping("/?specialty={speciality}")
    public List<Doctor> getAllBySpecialty(@RequestParam Speciality speciality) {
        return doctorService.getAllBySpecialty(speciality);
    }

    @PostMapping
    public void addDoctor(@RequestBody Doctor doctor) {
        doctorService.addDoctor(doctor);
    }
}
