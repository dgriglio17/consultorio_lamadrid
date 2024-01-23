package com.consultorios.lamadrid.services.impl;

import com.consultorios.lamadrid.entities.Doctor;
import com.consultorios.lamadrid.entities.Paciente;
import com.consultorios.lamadrid.repositories.IPacienteRepository;
import com.consultorios.lamadrid.services.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PacienteService implements IPacienteService {

    @Autowired
    private IPacienteRepository pacienteRepository;

    @Override
    public Paciente createPaciente(Paciente paciente) {
        Paciente pacienteSave = pacienteRepository.save(paciente);

        return pacienteSave;
    }

    @Override
    public Paciente getPacienteByNombreAndApellido(String nombre, String apellido) {
        Optional<Paciente> paciente = pacienteRepository.findPacienteByNombreAndApellido(nombre, apellido);
        return paciente.isPresent() ? paciente.get() : null;
    }

    @Override
    public Paciente getPacienteByDni(String dni) {
        Optional<Paciente> paciente = pacienteRepository.findPacienteByDni(dni);
        return paciente.isPresent() ? paciente.get() : null;
    }


}
