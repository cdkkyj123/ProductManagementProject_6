package com.example.productmanagementproject_6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ProductManagementProject6Application {

    public static void main(String[] args) {
        SpringApplication.run(ProductManagementProject6Application.class, args);
    }

}
