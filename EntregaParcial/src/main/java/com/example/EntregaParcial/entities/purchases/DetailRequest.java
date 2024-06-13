package com.example.EntregaParcial.entities.purchases;

import com.example.EntregaParcial.entities.Base;
import com.example.EntregaParcial.entities.articles.Article;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "detalles_pedido")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DetailRequest extends Base {
    @Column(name = "cantidad")
    private Integer quantity;
    @Column(name = "subtotal")
    private Double subtotal;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Request request;

    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Article article;

}
