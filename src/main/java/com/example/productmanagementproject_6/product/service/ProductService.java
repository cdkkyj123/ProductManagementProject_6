package com.example.productmanagementproject_6.product.service;

import com.example.productmanagementproject_6.product.entity.Product;
import com.example.productmanagementproject_6.product.repository.Productrepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final Productrepository productrepository;
}
