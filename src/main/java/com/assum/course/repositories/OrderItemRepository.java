package com.assum.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assum.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
