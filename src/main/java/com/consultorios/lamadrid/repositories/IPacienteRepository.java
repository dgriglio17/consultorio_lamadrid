package com.consultorios.lamadrid.repositories;

import com.consultorios.lamadrid.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IPacienteRepository extends JpaRepository<Paciente, Long> {

    Optional<Paciente> findPacienteByNombreAndApellido(String nombre, String apellido);

    Optional<Paciente> findPacienteByDni(String dni);

}
