package com.example.EntregaParcial.services.places;

import com.example.EntregaParcial.entities.places.Adress;
import com.example.EntregaParcial.entities.places.Locality;
import com.example.EntregaParcial.repositories.places.LocalityRepository;
import com.example.EntregaParcial.services.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalityService extends BaseService<Locality, Long> {
    @Autowired
    private LocalityRepository localityRepository;

    public LocalityService(LocalityRepository localityRepository){
        super(localityRepository);
    }

    @Transactional
    public List<Locality> listByProvinceId(Long idProvince) throws Exception {
        try{
            return localityRepository.findAllByProvinceId(idProvince);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
