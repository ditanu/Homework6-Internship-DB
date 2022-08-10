package com.homework6.restapi.service;

import com.homework6.restapi.model.Speciality;
import com.homework6.restapi.model.Visit;
import com.homework6.restapi.repository.VisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitService {
    private final VisitRepository visitRepository;

    public void addVisit(Visit visit) {
        visitRepository.save(visit);
    }

    public List<Visit> getAllVisitsBySpecialityAndCnp(String cnp, Speciality speciality) {
        return visitRepository.findAllByPatientCnpAndDoctorSpeciality(cnp, speciality);
    }
}
