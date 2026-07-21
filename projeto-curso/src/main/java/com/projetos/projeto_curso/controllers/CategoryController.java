package com.projetos.projeto_curso.controllers;

import com.projetos.projeto_curso.entities.Category;
import com.projetos.projeto_curso.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> getAll() {
        var categories = this.categoryService.listAll();

        return ResponseEntity.ok().body(categories);
    }

    @GetMapping(value = "/{categoryId}")
    public ResponseEntity<Category> getById(@PathVariable Long categoryId) {
        var category = this.categoryService.listById(categoryId);

        return ResponseEntity.ok().body(category);
    }
}
