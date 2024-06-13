package com.example.EntregaParcial.repositories.places;

import com.example.EntregaParcial.entities.places.Adress;
import com.example.EntregaParcial.entities.places.Locality;
import com.example.EntregaParcial.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalityRepository extends BaseRepository<Locality, Long> {
        List<Locality> findAllByProvinceId(Long provinceId);
}
