package com.homework6.restapi.controller;

import com.homework6.restapi.model.Patient;
import com.homework6.restapi.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("patients")
public class PatientController {
    private final PatientService patientService;

    @PostMapping
    public void savePatient(@RequestBody Patient patient) {
        patientService.savePatient(patient);
    }

    @GetMapping()
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @GetMapping("/{cnp}")
    public Patient getPatientByCnp(@PathVariable("cnp") String cnp) {
        return patientService.getPatientByCnp(cnp);
    }

}
