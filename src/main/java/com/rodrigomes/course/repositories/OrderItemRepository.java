package com.rodrigomes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigomes.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
