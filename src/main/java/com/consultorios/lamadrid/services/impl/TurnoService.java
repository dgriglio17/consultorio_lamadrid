package com.consultorios.lamadrid.services.impl;

import com.consultorios.lamadrid.entities.Turno;
import com.consultorios.lamadrid.repositories.ITurnoRepository;
import com.consultorios.lamadrid.services.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TurnoService implements ITurnoService {

    @Autowired
    private ITurnoRepository turnoRepository;

    @Override
    public Turno createTurno(Turno turno) {
        Turno turnoCreated = turnoRepository.save(turno);

        return turnoCreated;
    }

    @Override
    public List<Turno> getTurnosByDatesBetween(String start, String end) {

        //TODO busqueda por rango de fechas
        LocalDate startDate = LocalDate.parse(start);
        LocalDate endDate = LocalDate.parse(end);

        List<Turno> turnos = turnoRepository.findByFechaBetween(startDate, endDate);

        return turnos;
    }
}
