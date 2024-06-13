package com.example.EntregaParcial.controllers.promotions;

import com.example.EntregaParcial.controllers.BaseController;
import com.example.EntregaParcial.entities.Base;
import com.example.EntregaParcial.entities.promotions.DetailPromotion;
import com.example.EntregaParcial.entities.purchases.DetailRequest;
import com.example.EntregaParcial.services.promotions.DetailPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/detalles_promociones")
public class DetailPromotionController extends BaseController<DetailPromotion, Long> {

    @Autowired
    private DetailPromotionService detailPromotionService;

    public DetailPromotionController(DetailPromotionService detailPromotionService){
        super(detailPromotionService);
    }

    @GetMapping("/promocion/{idPromocion}")
    public ResponseEntity<List<DetailPromotion>> listByPromotion(@PathVariable Long idPromocion) throws Exception {
        List<DetailPromotion> detailPromotions = detailPromotionService.listByPromotion(idPromocion);
        return ResponseEntity.ok(detailPromotions);
    }
}
