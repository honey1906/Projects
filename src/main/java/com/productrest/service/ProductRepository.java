package com.productrest.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productrest.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>
{

}
