package com.example.EntregaParcial.controllers.purchases;

import com.example.EntregaParcial.controllers.BaseController;
import com.example.EntregaParcial.entities.persons.Client;
import com.example.EntregaParcial.entities.purchases.Request;
import com.example.EntregaParcial.services.purchases.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class RequestController extends BaseController<Request, Long> {
    @Autowired
    private RequestService requestService;
    public RequestController(RequestService requestService){
        super(requestService);
    }

    @PutMapping("/total")
    public Optional<Request> calculateTotal(@RequestBody Request request) throws Exception {
        Request requestAux = requestService.calculateTotal(request);
        return Optional.ofNullable(requestAux);
    }

    @GetMapping("/clientes/{clientId}")
    public ResponseEntity<List<Request>> listByClientId(@PathVariable  Long clientId) throws Exception {
        List<Request> requestList = requestService.listByClient(clientId);
        return ResponseEntity.ok(requestList);
    }

    @GetMapping("/empleados/{employeeId}")
    public ResponseEntity<List<Request>> listByEmployeeId(@PathVariable  Long employeeId) throws Exception {
        List<Request> requestList = requestService.listByEmployee(employeeId);
        return ResponseEntity.ok(requestList);
    }

    @GetMapping("/sucursales/{branchId}")
    public ResponseEntity<List<Request>> listByBranchId(@PathVariable  Long branchId) throws Exception {
        List<Request> requestList = requestService.listByBranch(branchId);
        return ResponseEntity.ok(requestList);
    }
}
