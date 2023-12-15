package com.consultorios.lamadrid.services.impl;

import com.consultorios.lamadrid.entities.Paciente;
import com.consultorios.lamadrid.services.IPacienteService;
import org.springframework.stereotype.Service;

@Service
public class PacienteService implements IPacienteService {
    @Override
    public Paciente getPacienteByNombreAndApellido(String nombre, String apellido) {
        return null;
    }

    @Override
    public Paciente getPacienteByMatricula(String matricula) {
        return null;
    }
}
