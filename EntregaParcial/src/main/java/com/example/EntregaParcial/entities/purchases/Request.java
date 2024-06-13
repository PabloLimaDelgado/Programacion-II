package com.example.EntregaParcial.entities.purchases;

import com.example.EntregaParcial.entities.Base;
import com.example.EntregaParcial.entities.enums.PaymentForm;
import com.example.EntregaParcial.entities.enums.ShipmentType;
import com.example.EntregaParcial.entities.enums.State;
import com.example.EntregaParcial.entities.persons.Client;
import com.example.EntregaParcial.entities.persons.Employee;
import com.example.EntregaParcial.entities.places.Adress;
import com.example.EntregaParcial.entities.places.Branch;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "pedidos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Request extends Base {
    @Column(name = "hora_estimada_finalizacion")
    private LocalTime estimatedEndTime;

    @Column(name = "total")
    private Double total;

    @Column(name = "total_costo")
    private Double totalCost;

    @Column(name = "estado")
    @Enumerated(EnumType.STRING)
    private State state;

    @Column(name = "tipo_envio")
    @Enumerated(EnumType.STRING)
    private ShipmentType shipmentType;

    @Column(name = "forma_pago")
    @Enumerated(EnumType.STRING)
    private PaymentForm paymentForm;

    @Column(name = "fecha_pedido")
    private LocalDate dateOrder;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Employee employee;

    //@ManyToOne(cascade = CascadeType.MERGE)
    //@JoinColumn(name = "id_domicilio")
    //private Adress adress;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_sucursal")
    private Branch branch;

    //@OneToMany(mappedBy = "request")
    //private Set<DetailRequest> detailsRequest = new HashSet<>();

}
