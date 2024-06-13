package com.example.EntregaParcial.entities.purchases;

import com.example.EntregaParcial.entities.Base;
import com.example.EntregaParcial.entities.enums.PaymentForm;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "facturas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Invoice extends Base {

    @Column(name = "fecha_facturacion")
    private LocalDate dateInvoicing;

    @Column(name = "forma_pago")
    private PaymentForm paymentForm;

    @Column(name = "total_ventas")
    private Double totalSales;

    @OneToOne
    private Request request;
}
