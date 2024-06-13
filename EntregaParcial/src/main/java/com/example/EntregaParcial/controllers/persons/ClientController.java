package com.example.EntregaParcial.controllers.persons;

import com.example.EntregaParcial.controllers.BaseController;
import com.example.EntregaParcial.entities.enums.Role;
import com.example.EntregaParcial.entities.persons.Client;
import com.example.EntregaParcial.services.persons.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientController extends BaseController<Client, Long> {
    @Autowired
    private ClientService clientService;

    public ClientController(ClientService clientService){
        super(clientService);
        this.clientService = clientService;
    }

    @GetMapping("/role/{id}")
    public Role findByRoleById(@PathVariable Long id){
        return clientService.findRoleById(id);
    }

    @GetMapping("/sucursales/{idAdress}")
    public ResponseEntity<List<Client>> listByAdress(@PathVariable Long idAdress) throws Exception {
        List<Client> clientList = clientService.listByAdress(idAdress);
        return ResponseEntity.ok(clientList);
    }
}
