package com.example.EntregaParcial.services.persons;

import com.example.EntregaParcial.entities.enums.Role;
import com.example.EntregaParcial.entities.persons.Client;
import com.example.EntregaParcial.repositories.persons.ClientRepository;
import com.example.EntregaParcial.services.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService extends BaseService<Client, Long> {
    @Autowired
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository){
        super(clientRepository);
        this.clientRepository = clientRepository;
    }
    public Role findRoleById(Long id){
        return clientRepository.findById(id).orElse(null).getRole();
    }

    @Transactional
    public List<Client> listByAdress(Long idAdress) throws Exception {
        try{
            return clientRepository.findAllByAdressId(idAdress);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
