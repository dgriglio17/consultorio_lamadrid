package com.consultorios.lamadrid.services;

import com.consultorios.lamadrid.entities.Turno;

import java.time.LocalDateTime;
import java.util.List;

public interface ITurnoService {

    List<Turno> getTurnosByDatesBetween(LocalDateTime start, LocalDateTime end);

}
