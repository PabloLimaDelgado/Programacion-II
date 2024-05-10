package com.example.miApiRest.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity //Tabla en la base de datos
@Table(name = "clientes") //Nombre de la tabla
@Data
@AllArgsConstructor //Todas las combinaciones de constructores
@NoArgsConstructor
@Getter
@Setter
public class Empleado extends Persona implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "Rol")
        protected Rol rol;
}
