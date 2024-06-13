package com.example.EntregaParcial.entities.promotions;

import com.example.EntregaParcial.entities.Base;
import com.example.EntregaParcial.entities.articles.Article;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "detalles_promocion")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DetailPromotion extends Base {

    @Column(name = "cantidad")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "promocion_id", nullable = false)
    private Promotion promotion;

    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Article article;
}
