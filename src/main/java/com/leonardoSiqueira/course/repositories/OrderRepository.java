package com.leonardoSiqueira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardoSiqueira.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
