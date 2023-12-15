package com.consultorios.lamadrid.services;

import com.consultorios.lamadrid.entities.Doctor;

public interface IDoctorService {

    Doctor createDoctor(Doctor doctor);

    Doctor getDoctorByNombreAndApellido(String nombre, String apellido);

    Doctor getDoctorByMatricula(String matricula);

}
