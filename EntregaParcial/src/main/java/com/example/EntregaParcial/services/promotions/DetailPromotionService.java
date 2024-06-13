package com.example.EntregaParcial.services.promotions;

import com.example.EntregaParcial.entities.promotions.DetailPromotion;
import com.example.EntregaParcial.repositories.promotions.DetailPromotionRepository;
import com.example.EntregaParcial.services.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailPromotionService extends BaseService<DetailPromotion, Long> {

    @Autowired
    private DetailPromotionRepository detailPromotionRepository;

    public DetailPromotionService(DetailPromotionRepository detailPromotionRepository){
        super(detailPromotionRepository);
    }

    @Transactional
    public List<DetailPromotion> listByPromotion(Long idPromotion) throws Exception {
        try {
            return detailPromotionRepository.findAllByPromotionId(idPromotion);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
