package com.example.productmanagementproject_6.product.entity;

import com.example.productmanagementproject_6.global.entity.BaseEntity;
import com.example.productmanagementproject_6.user.entity.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Entity
@Table(name = "products")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(nullable = false)
    private String productName;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private int price;
    @Column(nullable = false)
    private int stock;
    @Column(nullable = false)
    private String status;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // 등록관리자

    public Product(String productName, String category, int price, int stock, String status, User user) {
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.status = status;
        this.user = user;
    }
    // alright
}
