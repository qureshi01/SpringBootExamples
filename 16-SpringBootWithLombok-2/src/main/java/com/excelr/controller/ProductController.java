package com.excelr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.model.Product;
import com.excelr.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	@GetMapping("/getProduct")
	public List<Product> getProduct() {
		return service.getAllProducts();
		
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
		
	}
	
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		return service.saveProduct(product);
		
	}
}

