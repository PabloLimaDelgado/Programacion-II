package com.example.EntregaParcial.repositories.places;

import com.example.EntregaParcial.entities.places.Adress;
import com.example.EntregaParcial.repositories.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdressRepository extends BaseRepository<Adress, Long> {
    List<Adress> findAllByLocalityId(Long localityId);

    @Query("SELECT a FROM Adress a JOIN a.clients c WHERE c.id = :clientId")
    List<Adress> findAllByClientId(@Param("clientId") Long clientId);
}
