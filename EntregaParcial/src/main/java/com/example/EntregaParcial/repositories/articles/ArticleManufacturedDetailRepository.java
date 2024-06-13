package com.example.EntregaParcial.repositories.articles;

import com.example.EntregaParcial.entities.articles.ArticleManufacturedDetail;
import com.example.EntregaParcial.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleManufacturedDetailRepository extends BaseRepository<ArticleManufacturedDetail, Long> {
    List<ArticleManufacturedDetail> findAllByArticleManufacturedId(Long articleManufacturedId);
    List<ArticleManufacturedDetail> findAllByInputArticleId(Long inputArticleId);
}
