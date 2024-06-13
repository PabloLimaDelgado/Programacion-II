package com.example.EntregaParcial.entities.articles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "articulos_insumo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
public class InputArticle extends Article {

    @Column(name = "precio_compra")
    private Double purchasePrice;

    @Column(name = "stock_actual")
    private Integer actualStock;

    @Column(name = "stock_maximo")
    private Integer maxStock;

    @Column(name = "es_para_elaborar")
    private Boolean isToElaborate;


}
