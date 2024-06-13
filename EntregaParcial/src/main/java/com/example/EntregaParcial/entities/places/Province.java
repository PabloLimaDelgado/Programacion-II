package com.example.EntregaParcial.entities.places;

import com.example.EntregaParcial.entities.Base;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "provincias")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Province extends Base {
    @Column(name = "nombre")
    private String name;

    //@OneToMany(mappedBy = "province", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<Locality> localities;

    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Country country;

}
