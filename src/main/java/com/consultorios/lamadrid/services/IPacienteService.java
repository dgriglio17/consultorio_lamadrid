package com.consultorios.lamadrid.services;

import com.consultorios.lamadrid.entities.Doctor;
import com.consultorios.lamadrid.entities.Paciente;

public interface IPacienteService {

    Paciente createPaciente(Paciente paciente);

    Paciente getPacienteByNombreAndApellido(String nombre, String apellido);

    Paciente getPacienteByDni(String dni);

}
