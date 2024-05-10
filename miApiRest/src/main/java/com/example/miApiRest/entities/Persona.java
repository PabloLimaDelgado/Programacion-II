package com.example.miApiRest.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable; //Se convierten a bytes
import java.time.LocalDate;

@Entity //Tabla en la base de datos
@Table(name = "personas") //Nombre de la tabla
@Data
@AllArgsConstructor //Todas las combinaciones de constructores
@NoArgsConstructor
@Getter
@Setter
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_persona")
    protected String nombre;

    @Column(name = "apellido_persona")
    protected String apellido;

    @Column(name = "telefono_persona")
    protected String telefono;

    //@Column(name = "email_persona")
    protected String email;

    //@Column(name = "fecha_acimiento_persona")
    protected LocalDate fechaNacimiento;
}
