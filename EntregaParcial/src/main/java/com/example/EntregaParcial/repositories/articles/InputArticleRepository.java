package com.example.EntregaParcial.repositories.articles;

import com.example.EntregaParcial.entities.articles.InputArticle;
import com.example.EntregaParcial.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InputArticleRepository extends BaseRepository<InputArticle, Long> {
    List<InputArticle> findAllByCategoryId(Long idCategory);
}
