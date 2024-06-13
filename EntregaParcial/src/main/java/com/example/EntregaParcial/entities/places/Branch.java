package com.example.EntregaParcial.entities.places;

import com.example.EntregaParcial.entities.Base;
import com.example.EntregaParcial.entities.persons.Employee;
import com.example.EntregaParcial.entities.promotions.Promotion;
import com.example.EntregaParcial.entities.purchases.Category;
import com.example.EntregaParcial.entities.purchases.Request;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "sucursales")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Branch extends Base {
    @Column(name = "nombre")
    private String name;
    @Column(name = "hora_apertura")
    private LocalTime openingHours;
    @Column(name = "hora_cierre")
    private LocalTime hoursClosing;
    @Column(name = "casa_matriz")
    private boolean headOffice;

    //@OneToMany(mappedBy = "branch", cascade = CascadeType.REMOVE, orphanRemoval = true)
    //@Builder.Default
    //private List<Employee> employees = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "id_domicilio")
    private Adress adress;

    //@OneToMany(mappedBy = "branch", cascade = CascadeType.MERGE, orphanRemoval = true)
    //@Builder.Default
    //private List<Request> requests = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Company company;

    @ManyToMany
    @JoinTable(
            name = "sucursal_categoria",
            joinColumns = @JoinColumn(name = "sucursal_id"),
            inverseJoinColumns = @JoinColumn(name = "categoria_id")
    )
    @Builder.Default
    private Set<Category> categories = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "sucursal_promocion",
            joinColumns = @JoinColumn(name = "sucursal_id"),
            inverseJoinColumns = @JoinColumn(name = "promocion_id")
    )
    @Builder.Default
    private Set<Promotion> promotions = new HashSet<>();
}
