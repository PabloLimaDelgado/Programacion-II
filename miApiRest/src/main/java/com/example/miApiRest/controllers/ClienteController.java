package com.example.miApiRest.controllers;

import com.example.miApiRest.entities.Cliente;
import com.example.miApiRest.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/clientes")
    public Cliente crearCliente(@RequestBody Cliente cliente){
        return clienteService.createCliente(cliente);
    }
    @GetMapping("/clientes/{id}")
    public Cliente buscarClientePorId(@PathVariable Long id){
        return clienteService.buscarClienteId(id);
    }
    @GetMapping("/clientes")
    public List<Cliente> listarCliente(){
        return clienteService.listarClientes();
    }
    @PutMapping("/clientes")
    public Cliente actualizarCliente(@RequestBody Cliente cliente){
        return clienteService.actualizarCliente(cliente);
    }
    @DeleteMapping("/clientes/{id}")
    public void eliminarCliente(@PathVariable Long id){
        clienteService.eliminarCliente(id);
    }
}
