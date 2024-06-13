package com.example.EntregaParcial.services.places;

import com.example.EntregaParcial.entities.places.Country;
import com.example.EntregaParcial.repositories.places.CountryRepository;
import com.example.EntregaParcial.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends BaseService<Country, Long> {
    public CountryService(CountryRepository countryRepository){
        super(countryRepository);
    }
}
