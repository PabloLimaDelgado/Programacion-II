package com.example.EntregaParcial.entities.articles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "articulos_manufacturados")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
public class ArticleManufactured extends Article {
    @Column(name = "descripcion")
    private String description;

    @Column(name = "tiempo_estimado_minutos")
    private Integer timeEstimatedMinutes;

    @Column(name = "preparacion")
    private String preparation;


}
