package com.example.EntregaParcial.services.places;

import com.example.EntregaParcial.entities.places.Locality;
import com.example.EntregaParcial.entities.places.Province;
import com.example.EntregaParcial.repositories.places.ProvinceRepository;
import com.example.EntregaParcial.services.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceService extends BaseService<Province, Long> {
    @Autowired
    private ProvinceRepository provinceRepository;
    public ProvinceService(ProvinceRepository provinceRepository){
        super(provinceRepository);
    }

    @Transactional
    public List<Province> listByCountryId(Long countryId) throws Exception {
        try{
            return provinceRepository.findAllByCountryId(countryId);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
