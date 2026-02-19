package com.example.productmanagementproject_6.cart.controller;

import com.example.productmanagementproject_6.cart.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carts")//공통경로
@RequiredArgsConstructor
@Validated
public class CartController {

    private final CartRepository cartRepository;
}
