package com.example.EntregaParcial.controllers.articles;

import com.example.EntregaParcial.controllers.BaseController;
import com.example.EntregaParcial.entities.articles.Article;
import com.example.EntregaParcial.entities.articles.MeasuringUnit;
import com.example.EntregaParcial.services.articles.MeasuringUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/unidades_medidas")
public class MeasuringUnitController extends BaseController<MeasuringUnit, Long> {
    public MeasuringUnitController(MeasuringUnitService measuringUnitService){
        super(measuringUnitService);
    }

    @Autowired
    private MeasuringUnitService measuringUnitService;

    @PostMapping("/articulos/{id_Ar}")
    public Optional<Article> addArticle(@PathVariable Long id_Ar, @RequestBody Article newArticle) {
        try {
            Article addedArticle = measuringUnitService.addArticle(id_Ar, newArticle);
            return Optional.of(addedArticle);
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
