package com.example.productmanagementproject_6.product.controller;

import com.example.productmanagementproject_6.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
}
