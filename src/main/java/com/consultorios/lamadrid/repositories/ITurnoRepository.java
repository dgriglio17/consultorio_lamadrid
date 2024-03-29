package com.consultorios.lamadrid.repositories;

import com.consultorios.lamadrid.entities.Turno;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface ITurnoRepository extends MongoRepository<Turno, String> {

    List<Turno> findByFechaBetween(LocalDate startDate, LocalDate endDate);

}
