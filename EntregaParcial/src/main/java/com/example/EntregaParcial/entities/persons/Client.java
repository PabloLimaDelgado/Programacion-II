package com.example.EntregaParcial.entities.persons;

import com.example.EntregaParcial.entities.places.Adress;
import com.example.EntregaParcial.entities.purchases.Request;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class Client extends Person{
    //@OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    //@Builder.Default
    //private Set<Request> requests = new HashSet<>();

    @ManyToMany
    @Builder.Default
    @JoinTable(
            name = "cliente_direcciones",
            joinColumns = @JoinColumn(name = "id_cliente"),
            inverseJoinColumns = @JoinColumn(name = "id_direcciones")

    )
    private Set<Adress> adresses = new HashSet<>();
}
