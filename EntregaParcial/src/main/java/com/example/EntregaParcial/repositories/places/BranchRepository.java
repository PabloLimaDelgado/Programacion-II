package com.example.EntregaParcial.repositories.places;

import com.example.EntregaParcial.entities.places.Branch;
import com.example.EntregaParcial.repositories.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BranchRepository extends BaseRepository<Branch, Long> {
    @Query("SELECT b FROM Branch b JOIN b.categories c WHERE c.id = :idCategory")
    List<Branch> findAllByCategoryId(@Param("idCategory") Long idCategory);

    @Query("SELECT b FROM Branch b JOIN b.promotions c WHERE c.id = :idPromotion")
    List<Branch> findAllByPromotionId(@Param("idPromotion") Long idPromotion);

    List<Branch> findAllByCompanyId(Long idCompany);
}
