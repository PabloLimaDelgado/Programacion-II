package com.example.EntregaParcial.services.promotions;

import com.example.EntregaParcial.entities.promotions.Promotion;
import com.example.EntregaParcial.repositories.promotions.PromotionRepository;
import com.example.EntregaParcial.services.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionService extends BaseService<Promotion, Long> {
    @Autowired
    private PromotionRepository promotionRepository;
    public PromotionService(PromotionRepository promotionRepository){
        super(promotionRepository);
    }

    @Transactional
    public List<Promotion> listByBranchId(Long branchId) throws Exception {
        try {
            return promotionRepository.findAllByBranchId(branchId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
