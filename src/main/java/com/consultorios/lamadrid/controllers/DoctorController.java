package com.consultorios.lamadrid.controllers;

import com.consultorios.lamadrid.entities.Doctor;
import com.consultorios.lamadrid.services.impl.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping
    public ResponseEntity<Doctor> createDoctor(@RequestBody Doctor doctor) {
        Doctor doctorCreated = doctorService.createDoctor(doctor);
        return new ResponseEntity<>(doctorCreated, HttpStatus.CREATED);
    }

    @GetMapping(value = "/{matricula}")
    public ResponseEntity<Doctor> getDoctorByMatricula(@PathVariable String matricula) {
        Doctor doctorByMatricula = doctorService.getDoctorByMatricula(matricula);
        return new ResponseEntity(doctorByMatricula, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Doctor> getDoctorPorNombreAndApellido(@RequestParam String nombre, @RequestParam String apellido) {
        Doctor doctor = doctorService.getDoctorByNombreAndApellido(nombre, apellido);
        return doctor != null ? new ResponseEntity(doctor, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}