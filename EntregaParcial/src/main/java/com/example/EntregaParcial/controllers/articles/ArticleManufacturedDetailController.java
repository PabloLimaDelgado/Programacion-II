package com.example.EntregaParcial.controllers.articles;

import com.example.EntregaParcial.controllers.BaseController;
import com.example.EntregaParcial.entities.articles.ArticleManufacturedDetail;
import com.example.EntregaParcial.services.articles.ArticleManufacturedDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/articulos_manufacturados_detalles")
public class ArticleManufacturedDetailController extends BaseController<ArticleManufacturedDetail, Long> {
    @Autowired
    private ArticleManufacturedDetailService articleManufacturedDetailService;

    public ArticleManufacturedDetailController(ArticleManufacturedDetailService articleManufacturedDetailService) {
        super(articleManufacturedDetailService);
    }

    @GetMapping("/articulo_manufacturado/{articleManufacturedId}")
    public ResponseEntity<List<ArticleManufacturedDetail>> listByArticleManufacturedId(@PathVariable Long articleManufacturedId) throws Exception {
        List<ArticleManufacturedDetail> articleManufacturedDetailList = articleManufacturedDetailService.listByArticleManufacturedId(articleManufacturedId);
        return ResponseEntity.ok(articleManufacturedDetailList);
    }

    @GetMapping("/articulo_insumo/{inputArticleId}")
    public ResponseEntity<List<ArticleManufacturedDetail>> listByInputArticleId(@PathVariable Long inputArticleId) throws Exception {
        List<ArticleManufacturedDetail> articleManufacturedDetailList = articleManufacturedDetailService.listByInputArticleId(inputArticleId);
        return ResponseEntity.ok(articleManufacturedDetailList);
    }
}
