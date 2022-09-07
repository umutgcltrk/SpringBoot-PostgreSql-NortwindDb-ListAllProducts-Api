package com.example.camping.business.concretes;

import com.example.camping.business.abstracts.ProductService;
import com.example.camping.dataAccess.abstracts.ProductDao;
import com.example.camping.entity.concretes.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {
    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Products> getAll() {
        return this.productDao.findAll();
    }
}
