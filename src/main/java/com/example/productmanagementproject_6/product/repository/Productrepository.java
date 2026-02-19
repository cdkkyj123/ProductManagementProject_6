package com.example.productmanagementproject_6.product.repository;

import com.example.productmanagementproject_6.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Productrepository extends JpaRepository<Product, Long> {
}
