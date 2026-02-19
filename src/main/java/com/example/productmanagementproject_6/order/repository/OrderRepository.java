package com.example.productmanagementproject_6.order.repository;

import com.example.productmanagementproject_6.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
