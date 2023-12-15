package com.consultorios.lamadrid.services.impl;

import com.consultorios.lamadrid.entities.Turno;
import com.consultorios.lamadrid.services.ITurnoService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TurnoService implements ITurnoService {
    @Override
    public List<Turno> getTurnosByDatesBetween(LocalDateTime start, LocalDateTime end) {
        return null;
    }
}
