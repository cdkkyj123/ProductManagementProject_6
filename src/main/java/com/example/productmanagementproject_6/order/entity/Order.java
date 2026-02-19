package com.example.productmanagementproject_6.order.entity;


import com.example.productmanagementproject_6.global.entity.BaseEntity;
import com.example.productmanagementproject_6.product.entity.Product;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Order extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private int productPrice;

    @Column
    private String cancelReason;

    @Column(nullable = false)
    private String userName;

//  product 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

//  user 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Order(int productPrice, int quantity, String status, Product product , User user) {
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.status = status;
        this.product = product;
        this.user = user;
    }
    // alright
}
