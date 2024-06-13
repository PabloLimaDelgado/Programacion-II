package com.example.EntregaParcial.entities.places;

import com.example.EntregaParcial.entities.Base;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "paises")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Country extends Base {
    @Column(name = "nombre")
    private String name;

    //@OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<Province> provinces;
}
