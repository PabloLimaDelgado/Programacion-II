package com.example.EntregaParcial.services.places;

import com.example.EntregaParcial.entities.places.Branch;
import com.example.EntregaParcial.repositories.places.BranchRepository;
import com.example.EntregaParcial.services.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService extends BaseService<Branch, Long> {
    @Autowired
    private BranchRepository branchRepository;
    public BranchService(BranchRepository branchRepository) {
        super(branchRepository);
    }

    @Transactional
    public List<Branch> listByCategory(Long idCategory) throws Exception {
        try {
            return branchRepository.findAllByCategoryId(idCategory);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Branch> listByPromotion(Long idPromotion) throws Exception {
        try{
            return branchRepository.findAllByPromotionId(idPromotion);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Branch> listByCompany(Long idCompany) throws Exception {
       try{
           return branchRepository.findAllByCompanyId(idCompany);
       } catch (Exception e){
           throw new Exception(e.getMessage());
       }
    }
}
