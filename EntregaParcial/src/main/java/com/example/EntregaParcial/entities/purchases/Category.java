package com.example.EntregaParcial.entities.purchases;

import com.example.EntregaParcial.entities.Base;
import com.example.EntregaParcial.entities.places.Branch;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categorias")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category extends Base {

    @Column(name = "denominacion")
    private String denomitacion;

    @OneToMany(mappedBy = "categoryDad")
    @Builder.Default
    private Set<Category> subcategories = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "categoria_padre_id")
    @JsonIgnore
    private Category categoryDad;

    @ManyToMany(mappedBy = "categories")
    @JsonIgnore
    @Builder.Default
    private Set<Branch> branches = new HashSet<>();
}
