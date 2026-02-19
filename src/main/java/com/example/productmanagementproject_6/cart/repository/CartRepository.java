package com.example.productmanagementproject_6.cart.repository;

import com.example.productmanagementproject_6.cart.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {


}
