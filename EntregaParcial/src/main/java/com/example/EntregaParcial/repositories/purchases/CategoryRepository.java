package com.example.EntregaParcial.repositories.purchases;

import com.example.EntregaParcial.entities.places.Branch;
import com.example.EntregaParcial.entities.purchases.Category;
import com.example.EntregaParcial.repositories.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryRepository extends BaseRepository <Category, Long> {
    List<Category> findAllByCategoryDad_Id(Long idCategoryDad);
    List<Category> findAllByBranchesId(Long branchId);
}
