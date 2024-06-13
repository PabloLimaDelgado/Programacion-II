package com.example.EntregaParcial.repositories.purchases;

import com.example.EntregaParcial.entities.purchases.Invoice;
import com.example.EntregaParcial.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends BaseRepository<Invoice, Long> {
}
