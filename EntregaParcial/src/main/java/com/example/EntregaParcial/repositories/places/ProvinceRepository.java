package com.example.EntregaParcial.repositories.places;

import com.example.EntregaParcial.entities.places.Province;
import com.example.EntregaParcial.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinceRepository extends BaseRepository<Province, Long> {
    List<Province> findAllByCountryId(Long countryId);

}
