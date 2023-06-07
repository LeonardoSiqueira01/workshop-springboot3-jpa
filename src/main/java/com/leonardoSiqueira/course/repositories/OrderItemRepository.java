package com.leonardoSiqueira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardoSiqueira.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
