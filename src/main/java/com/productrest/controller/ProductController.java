package com.productrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productrest.model.Product;
import com.productrest.service.ProductService;

@RestController
public class ProductController 
{
	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	public List<Product> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/product/{id}")
	public Product get(@PathVariable Integer id)
	{
		return service.get(id);
	}
	
	@PostMapping("/Products")
	public void add(@RequestBody Product product)
	{
		service.save(product);
	}
	
	@PutMapping("/products/{id}")
	public Product update (@RequestBody Product product, @PathVariable Integer id)
	{
		service.save(product);
		
		return product;
	}
	
	@DeleteMapping("/products/{id}")
	public void delete(@RequestBody Product product, @PathVariable Integer id)
	{
		service.delete(id);
	}

}
