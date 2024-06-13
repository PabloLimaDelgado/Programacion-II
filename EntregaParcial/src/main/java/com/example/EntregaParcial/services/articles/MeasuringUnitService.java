package com.example.EntregaParcial.services.articles;

import com.example.EntregaParcial.entities.articles.Article;
import com.example.EntregaParcial.entities.articles.MeasuringUnit;
import com.example.EntregaParcial.repositories.articles.MeasuringUnitRepository;
import com.example.EntregaParcial.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeasuringUnitService extends BaseService<MeasuringUnit, Long> {
    public MeasuringUnitService(MeasuringUnitRepository measuringUnitRepository){
        super(measuringUnitRepository);
    }

    @Autowired MeasuringUnitRepository measuringUnitRepository;

    public Article addArticle(Long idMeasuringUnit, Article newArticle) throws Exception{
        try {
            MeasuringUnit measuringUnit = measuringUnitRepository.findById(idMeasuringUnit).orElse(null);

            if(measuringUnit != null){
                newArticle.setMeasuringUnit(measuringUnit);
                //measuringUnit.getArticles().add(newArticle);
                measuringUnitRepository.save(measuringUnit);
                return newArticle;
            }else {
                return null;
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
