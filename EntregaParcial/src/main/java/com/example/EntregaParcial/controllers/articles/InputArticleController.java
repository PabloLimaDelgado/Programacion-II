package com.example.EntregaParcial.controllers.articles;

import com.example.EntregaParcial.controllers.BaseController;
import com.example.EntregaParcial.entities.articles.ArticleManufactured;
import com.example.EntregaParcial.entities.articles.InputArticle;
import com.example.EntregaParcial.services.articles.InputArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articulos_insumo")
public class InputArticleController extends BaseController<InputArticle, Long> {
    @Autowired
    private InputArticleService inputArticleService;
    public InputArticleController(InputArticleService inputArticleService){
        super(inputArticleService);
    }

    @GetMapping("/articulosCategoria/{idCategory}")
    public ResponseEntity<List<InputArticle>> listByCategory(@PathVariable Long idCategory) throws Exception{
        List<InputArticle> inputArticles = inputArticleService.listByCategory(idCategory);
        return  ResponseEntity.ok(inputArticles);
    }
}
