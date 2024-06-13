package com.example.EntregaParcial.services.purchases;

import com.example.EntregaParcial.entities.purchases.Invoice;
import com.example.EntregaParcial.entities.purchases.Request;
import com.example.EntregaParcial.repositories.purchases.InvoiceRepository;
import com.example.EntregaParcial.services.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService extends BaseService<Invoice, Long> {

    @Autowired
    private InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository){
        super(invoiceRepository);
    }

    @Transactional
    public Request findRequestById(Long id) throws Exception {
        try {
            return invoiceRepository.findById(id).orElse(null).getRequest();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
