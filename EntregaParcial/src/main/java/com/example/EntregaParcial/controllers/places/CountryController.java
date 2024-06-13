package com.example.EntregaParcial.controllers.places;

import com.example.EntregaParcial.controllers.BaseController;
import com.example.EntregaParcial.entities.places.Country;
import com.example.EntregaParcial.services.places.CountryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pais")
public class CountryController extends BaseController<Country, Long> {
    public CountryController(CountryService countryService){
        super(countryService);
    }
}
