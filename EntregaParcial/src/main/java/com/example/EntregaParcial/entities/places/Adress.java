package com.example.EntregaParcial.entities.places;

import com.example.EntregaParcial.entities.Base;
import com.example.EntregaParcial.entities.persons.Client;
import com.example.EntregaParcial.entities.purchases.Request;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "domicilios")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class Adress extends Base {
    @Column(name = "calle")
    private String street;
    @Column(name = "numero")
    private Integer number;
    @Column(name = "codigo_postal")
    private Integer cp;

    //@OneToMany(mappedBy = "adress")
    //@Builder.Default
    //private List<Request> requests = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_localidades")
    private Locality locality;

    //@ManyToMany(mappedBy = "adresses")
    //private List<Client> clients = new ArrayList<>();

    @ManyToMany(mappedBy = "adresses")
    @JsonIgnore
    @Builder.Default
    private Set<Client> clients = new HashSet<>();
}
