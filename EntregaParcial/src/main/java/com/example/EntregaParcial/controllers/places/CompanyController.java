package com.example.EntregaParcial.controllers.places;

import com.example.EntregaParcial.controllers.BaseController;
import com.example.EntregaParcial.entities.places.Company;
import com.example.EntregaParcial.services.places.CompanyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companias")
public class CompanyController extends BaseController<Company, Long> {
    public CompanyController(CompanyService companyService) {
        super(companyService);
    }
}
