package com.projetos.projeto_curso.services;

import com.projetos.projeto_curso.entities.Category;
import com.projetos.projeto_curso.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> listAll() {
        return this.categoryRepository.findAll();
    }

    public Category listById(Long categoryId) {
        Optional<Category> category = this.categoryRepository.findById(categoryId);

        return category.get();
    }
}
