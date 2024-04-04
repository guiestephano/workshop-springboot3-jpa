package com.guiestephano.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guiestephano.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
