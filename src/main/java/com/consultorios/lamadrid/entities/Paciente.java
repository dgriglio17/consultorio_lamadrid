package com.consultorios.lamadrid.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pacientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30)
    private String nombre;

    @Column(length = 30)
    private String apellido;

    @Column(unique = true, length = 10)
    private String dni;

    @Column(length = 20)
    private String telefono;
}
