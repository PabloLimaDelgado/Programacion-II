package com.example.EntregaParcial.repositories.promotions;

import com.example.EntregaParcial.entities.places.Adress;
import com.example.EntregaParcial.entities.promotions.Promotion;
import com.example.EntregaParcial.repositories.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromotionRepository extends BaseRepository<Promotion, Long> {
    @Query("SELECT p FROM Promotion p JOIN p.branches c WHERE c.id = :branchId")
    List<Promotion> findAllByBranchId(@Param("branchId") Long branchId);
}
