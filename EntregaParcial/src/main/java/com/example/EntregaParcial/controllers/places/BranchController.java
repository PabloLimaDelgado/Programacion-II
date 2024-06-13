package com.example.EntregaParcial.controllers.places;

import com.example.EntregaParcial.controllers.BaseController;
import com.example.EntregaParcial.entities.places.Branch;
import com.example.EntregaParcial.services.places.BranchService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sucursales")
public class BranchController extends BaseController<Branch, Long> {
    @Autowired
    private BranchService branchService;

    public BranchController(BranchService branchService) {
        super(branchService);
    }

    @GetMapping("/categoria/{idCategory}")
    public ResponseEntity<List<Branch>> listByCategory(@PathVariable Long idCategory) throws Exception {
        List<Branch> branchList = branchService.listByCategory(idCategory);
        return ResponseEntity.ok(branchList);
    }

    @GetMapping("/promocion/{idPromotion}")
    public ResponseEntity<List<Branch>> listByPromotion(@PathVariable Long idPromotion) throws Exception {
        List<Branch> branchList = branchService.listByPromotion(idPromotion);
        return ResponseEntity.ok(branchList);
    }

    @GetMapping("/companias/{idCompany}")
    public ResponseEntity<List<Branch>> listByCompany(@PathVariable Long idCompany) throws Exception {
        List<Branch> branchList = branchService.listByCompany(idCompany);
        return ResponseEntity.ok(branchList);
    }
}
