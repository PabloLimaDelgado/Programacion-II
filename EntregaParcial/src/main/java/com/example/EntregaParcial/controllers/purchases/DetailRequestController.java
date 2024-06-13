package com.example.EntregaParcial.controllers.purchases;

import com.example.EntregaParcial.controllers.BaseController;
import com.example.EntregaParcial.entities.purchases.DetailRequest;
import com.example.EntregaParcial.services.purchases.DetailRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/detalles_pedido")
public class DetailRequestController extends BaseController<DetailRequest, Long> {

    @Autowired
    private DetailRequestService detailRequestService;

    public DetailRequestController(DetailRequestService detailRequestService){
        super(detailRequestService);
    }

    @GetMapping("/pedido/{idRequest}")
    public ResponseEntity<List<DetailRequest>> listByRequest(@PathVariable Long idRequest) throws Exception {
        List<DetailRequest> detailRequests = detailRequestService.listByRequest(idRequest);
        return ResponseEntity.ok(detailRequests);
    }
}
