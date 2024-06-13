package com.example.EntregaParcial.entities.articles;

import com.example.EntregaParcial.entities.Base;
import com.example.EntregaParcial.entities.persons.Image;
import com.example.EntregaParcial.entities.promotions.DetailPromotion;
import com.example.EntregaParcial.entities.purchases.Category;
import com.example.EntregaParcial.entities.purchases.DetailRequest;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ArticleManufactured.class, name = "ArticleManufactured"),
        @JsonSubTypes.Type(value = InputArticle.class, name = "InputArticle")
})

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Article extends Base  {

    @Column(name = "denominacion")
    protected String denomination;

    @Column(name = "precio_venta")
    protected Double priceSale;

    @ManyToOne
    @JoinColumn(name = "unidad_medida_id")
    private MeasuringUnit measuringUnit;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany
    @Builder.Default
    private Set<Image> imagesArticle = new HashSet<Image>();

    //@OneToMany(mappedBy = "article", orphanRemoval = true, cascade = CascadeType.PERSIST)
    //private List<DetailPromotion> detailPromotions = new ArrayList<DetailPromotion>();
}
