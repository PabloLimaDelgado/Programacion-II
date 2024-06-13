package com.example.EntregaParcial.services.purchases;

import com.example.EntregaParcial.entities.purchases.Category;
import com.example.EntregaParcial.repositories.purchases.CategoryRepository;
import com.example.EntregaParcial.services.BaseService;
import com.example.EntregaParcial.services.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService extends BaseService<Category, Long> {
    public CategoryService(CategoryRepository categoryRepository){
        super(categoryRepository);
    }

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional
    public Category addCategory(Long idCategoryDad, Category newSubCategory) throws Exception{
        try {
            Category categoryDad = categoryRepository.findById(idCategoryDad).orElse(null);

            if(categoryDad != null){
                newSubCategory.setCategoryDad(categoryDad);
                categoryRepository.save(newSubCategory);
                return newSubCategory;
            }else{
                return  null;
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Category> listByCategoryDad(Long idCategoryDad) throws Exception{
        try {
            return categoryRepository.findAllByCategoryDad_Id(idCategoryDad);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Category> findAllByBranchId(Long branchId) throws Exception {
        try {
            return categoryRepository.findAllByBranchesId(branchId);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
