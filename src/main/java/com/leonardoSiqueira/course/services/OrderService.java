package com.leonardoSiqueira.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardoSiqueira.course.entities.Order;
import com.leonardoSiqueira.course.repositories.OrderRepository;

@Service  //@componet - p/registrar componente     @repository - p/r repositorio  e @service - p/r serviço
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
