package com.homework6.restapi.mapper;

import com.homework6.restapi.dto.DoctorDTO;
import com.homework6.restapi.model.Doctor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DoctorMapper {
    DoctorDTO toDoctorDTO(Doctor doctor);
}
