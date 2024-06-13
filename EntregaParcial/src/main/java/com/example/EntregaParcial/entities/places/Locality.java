package com.example.EntregaParcial.entities.places;

import com.example.EntregaParcial.entities.Base;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "localidades")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Locality extends Base {
    @Column(name = "nombre")
    private String name;

    //@OneToMany(mappedBy = "locality", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<Adress> adresses;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_provincia")
    private Province province;
}
