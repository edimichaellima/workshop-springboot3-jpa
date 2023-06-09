package com.assum.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assum.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
