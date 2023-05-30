package com.leonardoSiqueira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardoSiqueira.course.entities.Category;
import com.leonardoSiqueira.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
