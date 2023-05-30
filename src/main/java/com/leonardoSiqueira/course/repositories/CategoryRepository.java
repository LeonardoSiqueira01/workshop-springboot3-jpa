package com.leonardoSiqueira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardoSiqueira.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
