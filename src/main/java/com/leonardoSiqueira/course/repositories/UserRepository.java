package com.leonardoSiqueira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardoSiqueira.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
