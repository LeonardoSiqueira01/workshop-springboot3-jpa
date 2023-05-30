package com.leonardoSiqueira.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardoSiqueira.course.entities.Product;
import com.leonardoSiqueira.course.repositories.ProductRepository;

@Service  //@componet - p/registrar componente     @repository - p/r repositorio  e @service - p/r serviço
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
