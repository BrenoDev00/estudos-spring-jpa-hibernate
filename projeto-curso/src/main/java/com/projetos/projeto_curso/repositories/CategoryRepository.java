package com.projetos.projeto_curso.repositories;

import com.projetos.projeto_curso.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
