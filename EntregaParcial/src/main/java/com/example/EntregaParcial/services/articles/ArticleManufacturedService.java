package com.example.EntregaParcial.services.articles;

import com.example.EntregaParcial.entities.articles.ArticleManufactured;
import com.example.EntregaParcial.repositories.articles.ArticleManufacturedRepository;
import com.example.EntregaParcial.services.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleManufacturedService extends BaseService<ArticleManufactured, Long> {
    @Autowired
    private ArticleManufacturedRepository articleManufacturedRepository;
    public ArticleManufacturedService(ArticleManufacturedRepository articleManufacturedRepository){
        super(articleManufacturedRepository);
    }

    @Transactional
    public List<ArticleManufactured> listByCategory(Long idCategory) throws Exception {
        try{
            return articleManufacturedRepository.findAllByCategoryId(idCategory);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
