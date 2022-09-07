package com.example.camping.api.controllers;

import com.example.camping.business.abstracts.ProductService;
import com.example.camping.entity.concretes.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductsController {

    private ProductService productService;
    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public List<Products> getAll(){
        return this.productService.getAll();
    }
}
