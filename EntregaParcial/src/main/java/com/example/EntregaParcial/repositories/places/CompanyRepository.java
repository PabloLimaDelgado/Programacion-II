package com.example.EntregaParcial.repositories.places;

import com.example.EntregaParcial.entities.places.Company;
import com.example.EntregaParcial.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends BaseRepository<Company, Long> {
}
