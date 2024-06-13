package com.example.EntregaParcial.services.articles;

import com.example.EntregaParcial.entities.articles.ArticleManufactured;
import com.example.EntregaParcial.entities.articles.InputArticle;
import com.example.EntregaParcial.repositories.articles.InputArticleRepository;
import com.example.EntregaParcial.services.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InputArticleService extends BaseService<InputArticle, Long> {
    @Autowired
    private InputArticleRepository inputArticleRepository;
    public InputArticleService(InputArticleRepository inputArticleRepository){
        super(inputArticleRepository);
    }

    @Transactional
    public List<InputArticle> listByCategory(Long idCategory) throws Exception {
        try{
            return inputArticleRepository.findAllByCategoryId(idCategory);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
