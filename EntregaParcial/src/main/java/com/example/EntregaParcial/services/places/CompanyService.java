package com.example.EntregaParcial.services.places;

import com.example.EntregaParcial.entities.places.Company;
import com.example.EntregaParcial.repositories.BaseRepository;
import com.example.EntregaParcial.repositories.places.CompanyRepository;
import com.example.EntregaParcial.services.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService extends BaseService<Company, Long> {
    public CompanyService(CompanyRepository companyRepository) {
        super(companyRepository);
    }
}
