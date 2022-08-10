package com.homework6.restapi.controller;

import com.homework6.restapi.model.Speciality;
import com.homework6.restapi.model.Visit;
import com.homework6.restapi.service.VisitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("visits")
public class VisitController {
    private final VisitService visitService;

    @PostMapping
    public void addVisit(@RequestBody Visit visit) {
        visitService.addVisit(visit);
    }

    @GetMapping("/{cnp}/{speciality}")
    public List<Visit> getAllVisitsBySpecialityAndCnp(@PathVariable String cnp, @PathVariable Speciality speciality) {
        return visitService.getAllVisitsBySpecialityAndCnp(cnp, speciality);
    }
}