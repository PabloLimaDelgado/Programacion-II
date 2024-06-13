package com.example.EntregaParcial.controllers.purchases;

import com.example.EntregaParcial.controllers.BaseController;
import com.example.EntregaParcial.entities.purchases.Category;
import com.example.EntregaParcial.services.purchases.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoryController extends BaseController<Category, Long> {
    public CategoryController(CategoryService categoryService){
        super(categoryService);
    }

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/subcategoria/{id_CP}")
    public Optional<Category> addSubCategory(@PathVariable Long id_CP, @RequestBody Category subCategory) throws Exception{
        Category catDad = categoryService.addCategory(id_CP, subCategory);
        return Optional.ofNullable(catDad);
    }

    @GetMapping("/categoriaPadre/{id}")
    public ResponseEntity<List<Category>> listByCategoryDad(@PathVariable Long id) throws Exception {
        List<Category> categories = categoryService.listByCategoryDad(id);
        return ResponseEntity.ok(categories);
    }

    @GetMapping("/branch/{idBranch}")
    public ResponseEntity<List<Category>> listByBranch(@PathVariable Long idBranch) throws Exception {
        List<Category> categories = categoryService.findAllByBranchId(idBranch);
        return ResponseEntity.ok(categories);
    }
}
