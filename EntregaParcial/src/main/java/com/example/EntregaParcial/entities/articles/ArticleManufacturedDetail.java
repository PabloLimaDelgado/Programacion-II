package com.example.EntregaParcial.entities.articles;

import com.example.EntregaParcial.entities.Base;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "articulos_manufacturados_detalles")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class ArticleManufacturedDetail extends Base {
    @Column(name = "cantidad")
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "articulo_insumo_id")
    private InputArticle inputArticle;

    @ManyToOne
    @JoinColumn(name = "articulo_manufacturado_id")
    private ArticleManufactured articleManufactured;


}
