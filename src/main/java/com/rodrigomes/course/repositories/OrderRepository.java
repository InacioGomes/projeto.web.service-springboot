package com.rodrigomes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigomes.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
