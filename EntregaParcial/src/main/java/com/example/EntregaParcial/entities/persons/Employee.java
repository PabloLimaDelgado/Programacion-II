package com.example.EntregaParcial.entities.persons;

import com.example.EntregaParcial.entities.enums.Role;
import com.example.EntregaParcial.entities.places.Branch;
import com.example.EntregaParcial.entities.purchases.Request;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "empleados")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class Employee extends Person{
    @ManyToOne
    @JoinColumn(name = "id_sucursal")
    private Branch branch;

    //@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    //@Builder.Default
    //private Set<Request> requests = new HashSet<>();
}
