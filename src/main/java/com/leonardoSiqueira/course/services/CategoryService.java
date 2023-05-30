package com.leonardoSiqueira.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardoSiqueira.course.entities.Category;
import com.leonardoSiqueira.course.repositories.CategoryRepository;

@Service  //@componet - p/registrar componente     @repository - p/r repositorio  e @service - p/r serviço
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
