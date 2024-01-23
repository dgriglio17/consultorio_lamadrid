package com.consultorios.lamadrid.services;

import com.consultorios.lamadrid.entities.Turno;

import java.time.LocalDate;
import java.util.List;

public interface ITurnoService {

    Turno createTurno(Turno turno);

    List<Turno> getTurnosByDatesBetween(String start, String end);

}
