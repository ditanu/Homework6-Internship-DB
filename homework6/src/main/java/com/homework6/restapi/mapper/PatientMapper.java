package com.homework6.restapi.mapper;

import com.homework6.restapi.dto.PatientDTO;
import com.homework6.restapi.model.Patient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    PatientDTO toPatientDTO(Patient patient);
}
