package com.consultorios.lamadrid.repositories;

import com.consultorios.lamadrid.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IDoctorRepository extends JpaRepository<Doctor, Long> {

    Optional<Doctor> findDoctorByNombreAndApellido(String nombre, String apellido);

    Optional<Doctor> findDoctorByMatricula(String matricula);

}
