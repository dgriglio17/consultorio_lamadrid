package com.consultorios.lamadrid.controllers;

import com.consultorios.lamadrid.entities.Doctor;
import com.consultorios.lamadrid.entities.Paciente;
import com.consultorios.lamadrid.services.impl.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping
    public ResponseEntity<Paciente> createPaciente(@RequestBody Paciente paciente) {
        Paciente pacienteCreated = pacienteService.createPaciente(paciente);
        return new ResponseEntity<>(pacienteCreated, HttpStatus.CREATED);
    }

    @GetMapping(value = "/{dni}")
    public ResponseEntity<Paciente> getPacienteByDni(@PathVariable String dni) {
        Paciente paciente = pacienteService.getPacienteByDni(dni);
        return paciente != null ? new ResponseEntity(paciente, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<Paciente> getPacientePorNombreAndApellido(@RequestParam String nombre, @RequestParam String apellido) {
        Paciente paciente = pacienteService.getPacienteByNombreAndApellido(nombre, apellido);
        return paciente != null ? new ResponseEntity(paciente, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
