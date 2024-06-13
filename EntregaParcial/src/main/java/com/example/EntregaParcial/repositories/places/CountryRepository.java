package com.example.EntregaParcial.repositories.places;

import com.example.EntregaParcial.entities.places.Country;
import com.example.EntregaParcial.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends BaseRepository<Country, Long> {
}
