package com.example.miApiRest.services;
import com.example.miApiRest.entities.Cliente;
import com.example.miApiRest.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    public Cliente createCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    public Cliente buscarClienteId(Long id){
        return clienteRepository.findById(id).orElse(null);
    }
    public List<Cliente> listarClientes(){
        return clienteRepository.findAll();
    }
    public Cliente actualizarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    public void eliminarCliente(Long id){
        clienteRepository.deleteById(id);
    }
}
