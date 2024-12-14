package com.learn.crud.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.crud.swagger.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

