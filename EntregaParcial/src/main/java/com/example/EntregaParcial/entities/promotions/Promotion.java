package com.example.EntregaParcial.entities.promotions;

import com.example.EntregaParcial.entities.Base;
import com.example.EntregaParcial.entities.enums.PromotionType;
import com.example.EntregaParcial.entities.persons.Image;
import com.example.EntregaParcial.entities.places.Branch;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "promociones")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Promotion extends Base {
    @Column(name = "denominacion")
    private String denomination;

    @Column(name = "fecha_desde")
    private LocalDate dateFrom;

    @Column(name = "fecha_hasta")
    private LocalDate dateTo;

    @Column(name = "hora_desde")
    private LocalTime timeFrom;

    @Column(name = "hora_hasta")
    private LocalTime timeTo;

    @Column(name = "descripcion_descuento")
    private String descriptionDiscount;

    @Column(name = "precio_promocional")
    private Double promotionalPrice;

    @Enumerated(EnumType.STRING)
    private PromotionType promotionType;

    @OneToMany
    @Builder.Default
    private Set<Image> imagesPromotion = new HashSet<Image>();

    @ManyToMany
    @JsonIgnore
    @Builder.Default
    private Set<Branch> branches = new HashSet<>();
}
