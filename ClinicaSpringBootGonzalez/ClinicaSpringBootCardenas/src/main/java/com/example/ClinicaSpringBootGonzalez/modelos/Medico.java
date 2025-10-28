package com.example.ClinicaSpringBootGonzalez.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "medicos")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String nombreCompleto;
    @Column(length = 50, nullable = false)
    private String especialidad;
    @Column(length = 50, nullable = false)
    private String correo;
    @Column(length = 50, nullable = false)
    private String telefono;
    @Column(length = 50, nullable = false)
    private Integer antiguedad;
    @Column(length = 50, nullable = false)
    private String clinica;
    @Column(length = 50, nullable = false)
    private LocalDate fechaNacimiento;
    @Column(length = 50, nullable = false)
    private String direccion;
    @Column(length = 50, nullable = false)
    private String idiomaPrincipal;


    @OneToOne
    @JoinColumn(name="tarjeta_profesional_id" , referencedColumnName = "id")
    private  TarjetaProfesional tarjetaProfesional;
}
