package com.excelr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.model.Product;
import com.excelr.service.ExcelrService;

@RestController
@CrossOrigin("*")


public class ExcelrController {
	
	@Autowired
	private ExcelrService service;
	
	@PostMapping("/save")
	public Product saveData(Product product) {
		service.saveData(product);
		return product;
	}

}
