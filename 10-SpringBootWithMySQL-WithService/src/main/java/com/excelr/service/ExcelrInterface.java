package com.excelr.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.excelr.model.Products;

public interface ExcelrInterface {
	public void saveProduct(Products product);
	
	public List<Products> getAllProducts();
	
	public void delete( int id);
	
    public Products getProduct(int id);
}
