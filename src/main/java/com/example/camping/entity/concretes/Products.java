package com.example.camping.entity.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue
    @Column(name = "product_id")
    private int id;
    @Column(name = "category_id")
    private int categoryId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "unit_price")
    private double unitPrice;
    @Column(name = "units_in_stock")
    private int unitsInStock;
    @Column(name = "quantity_per_unit")
    private String quantityPerUnit;
}
