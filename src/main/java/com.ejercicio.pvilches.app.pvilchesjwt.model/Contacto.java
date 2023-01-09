package com.ejercicio.pvilches.app.pvilchesjwt.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontacto")
    private Integer id;

    private String nombre;

    @Column(name = "fechanac")
    private LocalDate fechanacimiento;

    private Integer numerocelular;
    private String email;


}
