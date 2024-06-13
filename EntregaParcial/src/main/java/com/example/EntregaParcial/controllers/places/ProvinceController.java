package com.example.EntregaParcial.controllers.places;

import com.example.EntregaParcial.controllers.BaseController;
import com.example.EntregaParcial.entities.places.Province;
import com.example.EntregaParcial.services.places.ProvinceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provincia")
public class ProvinceController extends BaseController<Province, Long> {
    public ProvinceController(ProvinceService provinceService){
        super(provinceService);
    }
}
