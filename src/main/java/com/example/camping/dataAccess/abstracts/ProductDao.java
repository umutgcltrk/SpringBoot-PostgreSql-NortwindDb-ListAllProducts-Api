package com.example.camping.dataAccess.abstracts;

import com.example.camping.entity.concretes.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Products,Integer> {

}
