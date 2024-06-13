package com.example.EntregaParcial.controllers.purchases;

import com.example.EntregaParcial.controllers.BaseController;
import com.example.EntregaParcial.entities.purchases.Invoice;
import com.example.EntregaParcial.entities.purchases.Request;
import com.example.EntregaParcial.services.purchases.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factura")
public class InvoiceController extends BaseController<Invoice, Long> {

    @Autowired
    private InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService){
        super(invoiceService);
    }

    @GetMapping("/pedido/{id}")
    public ResponseEntity<Request> findRequestById(@PathVariable Long id) throws Exception {
        Request request = invoiceService.findRequestById(id);
        return ResponseEntity.ok(request);
    }
}
