package com.homework6.restapi.dto;

import com.homework6.restapi.model.Doctor;
import com.homework6.restapi.model.Speciality;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDTO {
    String name;
    Speciality speciality;

    public DoctorDTO(Doctor doctor) {
        this.name = doctor.getName();
        this.speciality = doctor.getSpeciality();
    }

}
