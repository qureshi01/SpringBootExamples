package com.excelr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.model.Product;
import com.excelr.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo repo;
	
	public Product saveProduct(Product product) {
		return repo.save(product);
		
	}
	
	public List<Product> getAllProducts(){
		return repo.findAll();
	}
	
	public String deleteProduct(int id) {
		repo.deleteById(id);
		return "Product deleted";
	}
	
	
	
}
