package com.example.EntregaParcial.controllers.promotions;

import com.example.EntregaParcial.controllers.BaseController;
import com.example.EntregaParcial.entities.promotions.Promotion;
import com.example.EntregaParcial.services.promotions.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
@RequestMapping("/promociones")
public class PromotionController extends BaseController<Promotion, Long> {
    @Autowired
    private PromotionService promotionService;
    public PromotionController(PromotionService promotionService){
        super(promotionService);
    }

    @GetMapping("/sucursales/{branchId}")
    public ResponseEntity<List<Promotion>> findByBranchId(@PathVariable Long branchId) throws Exception {
        List<Promotion> promotionList = promotionService.listByBranchId(branchId);
        return ResponseEntity.ok(promotionList);
    }
    //ESTE CONTROLLER OLBIGATORIO ME OBLIGA A CREAR EL ATRIBUTO private Set<Branch> branches = new HashSet<>(); que
    //crea una tabla nueva, pero vacia y en la llamada no devuelve nada porque esa tabla esta vacia ya que en el main
    //nunca se añade la tabla
}
