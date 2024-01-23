package com.consultorios.lamadrid.controllers;

import com.consultorios.lamadrid.entities.Paciente;
import com.consultorios.lamadrid.entities.Turno;
import com.consultorios.lamadrid.services.impl.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/turno")
public class TurnoController {

    @Autowired
    private TurnoService turnoService;

    @PostMapping
    public ResponseEntity<Turno> createTurno(@RequestBody Turno turno) {
        Turno turnoCreated = turnoService.createTurno(turno);
        return new ResponseEntity<>(turnoCreated, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Turno>> getTurnosBetweenDates(@RequestParam String start, @RequestParam String end) {
        List<Turno> turnos = turnoService.getTurnosByDatesBetween(start, end);
        return !turnos.isEmpty() ? new ResponseEntity(turnos, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
