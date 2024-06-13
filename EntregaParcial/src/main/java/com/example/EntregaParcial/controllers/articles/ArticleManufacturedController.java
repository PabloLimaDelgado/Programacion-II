package com.example.EntregaParcial.controllers.articles;

import com.example.EntregaParcial.controllers.BaseController;
import com.example.EntregaParcial.entities.articles.ArticleManufactured;
import com.example.EntregaParcial.services.articles.ArticleManufacturedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articulos_manufacturados")
public class ArticleManufacturedController extends BaseController<ArticleManufactured, Long> {
    @Autowired
    private ArticleManufacturedService articleManufacturedService;
    public ArticleManufacturedController(ArticleManufacturedService articleManufacturedService){
        super(articleManufacturedService);
    }

    @GetMapping("/articulosCategoria/{idCategory}")
    public ResponseEntity<List<ArticleManufactured>> listByCategory(@PathVariable Long idCategory) throws Exception{
        List<ArticleManufactured> articleManufactureds = articleManufacturedService.listByCategory(idCategory);
        return  ResponseEntity.ok(articleManufactureds);
    }

}
