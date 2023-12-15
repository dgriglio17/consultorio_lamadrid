package com.consultorios.lamadrid.services;

import com.consultorios.lamadrid.entities.Paciente;

public interface IPacienteService {

    Paciente getPacienteByNombreAndApellido(String nombre, String apellido);

    Paciente getPacienteByMatricula(String matricula);

}
