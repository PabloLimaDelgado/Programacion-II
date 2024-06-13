package com.example.EntregaParcial.repositories.persons;

import com.example.EntregaParcial.entities.persons.Client;
import com.example.EntregaParcial.entities.places.Branch;
import com.example.EntregaParcial.repositories.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  ClientRepository extends BaseRepository<Client, Long> {
    @Query("SELECT b FROM Client b JOIN b.adresses c WHERE c.id = :idAdress")
    List<Client> findAllByAdressId(@Param("idAdress") Long idAdress);
}
