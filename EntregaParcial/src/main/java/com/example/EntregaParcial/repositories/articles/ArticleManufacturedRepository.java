package com.example.EntregaParcial.repositories.articles;

import com.example.EntregaParcial.entities.articles.ArticleManufactured;
import com.example.EntregaParcial.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleManufacturedRepository extends BaseRepository<ArticleManufactured, Long> {
    List<ArticleManufactured> findAllByCategoryId(Long idCategory);
}
