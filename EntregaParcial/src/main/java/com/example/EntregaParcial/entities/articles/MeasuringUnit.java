package com.example.EntregaParcial.entities.articles;

import com.example.EntregaParcial.entities.Base;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "unidades_medida")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class MeasuringUnit extends Base {

    @Column(name = "denominacion")
    private String denomination;

    //@OneToMany(mappedBy = "measuringUnit",cascade = CascadeType.PERSIST, orphanRemoval = true)
    //private HashSet<Article> articles = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Article article;
}
