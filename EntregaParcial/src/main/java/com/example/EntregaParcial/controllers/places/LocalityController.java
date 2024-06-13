package com.example.EntregaParcial.controllers.places;

import com.example.EntregaParcial.controllers.BaseController;
import com.example.EntregaParcial.entities.places.Locality;
import com.example.EntregaParcial.services.places.LocalityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/localidad")
public class LocalityController extends BaseController<Locality, Long> {
    public LocalityController(LocalityService localityService){
        super(localityService);
    }

}
