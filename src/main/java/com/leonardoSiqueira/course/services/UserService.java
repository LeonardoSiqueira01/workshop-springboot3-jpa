package com.leonardoSiqueira.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardoSiqueira.course.entities.User;
import com.leonardoSiqueira.course.repositories.UserRepository;

@Service  //@componet - p/registrar componente     @repository - p/r repositorio  e @service - p/r serviço
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}
