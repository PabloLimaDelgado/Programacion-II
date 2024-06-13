package com.example.EntregaParcial.repositories.promotions;

import com.example.EntregaParcial.entities.promotions.DetailPromotion;
import com.example.EntregaParcial.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailPromotionRepository extends BaseRepository<DetailPromotion, Long> {
    List<DetailPromotion>  findAllByPromotionId(Long promotionId);
}
