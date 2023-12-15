package com.consultorios.lamadrid.services.impl;

import com.consultorios.lamadrid.entities.Doctor;
import com.consultorios.lamadrid.repositories.IDoctorRepository;
import com.consultorios.lamadrid.services.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoctorService implements IDoctorService {

    @Autowired
    private IDoctorRepository doctorRepository;

    @Override
    public Doctor createDoctor(Doctor doctor) {
        Doctor doctorSave = doctorRepository.save(doctor);

        return doctorSave;
    }

    @Override
    public Doctor getDoctorByNombreAndApellido(String nombre, String apellido) {
        Optional<Doctor> doctor = doctorRepository.findDoctorByNombreAndApellido(nombre, apellido);
        return doctor.isPresent() ? doctor.get() : null;
    }

    @Override
    public Doctor getDoctorByMatricula(String matricula) {
        return doctorRepository.findDoctorByMatricula(matricula).get();
    }
}
