package com.example.EntregaParcial.services.articles;

import com.example.EntregaParcial.entities.articles.ArticleManufacturedDetail;
import com.example.EntregaParcial.repositories.articles.ArticleManufacturedDetailRepository;
import com.example.EntregaParcial.services.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleManufacturedDetailService extends BaseService<ArticleManufacturedDetail, Long> {
    @Autowired
    private ArticleManufacturedDetailRepository articleManufacturedDetailRepository;
    public ArticleManufacturedDetailService(ArticleManufacturedDetailRepository articleManufacturedDetailRepository){
        super(articleManufacturedDetailRepository);
    }

    @Transactional
    public List<ArticleManufacturedDetail> listByArticleManufacturedId(Long articleManufacturedId) throws Exception {
        try{
            return articleManufacturedDetailRepository.findAllByArticleManufacturedId(articleManufacturedId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<ArticleManufacturedDetail> listByInputArticleId(Long inputArticleId) throws Exception {
        try{
            return articleManufacturedDetailRepository.findAllByInputArticleId(inputArticleId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
