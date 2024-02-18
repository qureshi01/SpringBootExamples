package com.excelr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.excelr.model.Products;
import com.excelr.service.ExcelrService;

@Controller
public class ExcelrController {
	
	@Autowired
	private ExcelrService service;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/addProduct")
	public String addProduct() {
		return "addProduct";
	}
	
	@RequestMapping("/success")
	public String success(Products product) {
		service.saveProduct(product);
		return "success";
	}
	
	@RequestMapping("/viewProduct")
	public String viewProduct(ModelMap model) {
		model.put("products", service.getAllProducts());
		return "viewProduct";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		service.delete(id);
		return "redirect:/viewProduct";

	}
	
	@RequestMapping("/edit/{id}")
	public String editProduct(@PathVariable int id, ModelMap model)  //fetching the records
	{
		model.put("product", service.getProduct(id));   //storing the records again in model 
		return "editProduct";
	}
	@RequestMapping("/updateandsave")
	public String updateandsave(Products product)  //fetching the records
	{
		service.saveProduct(product);  //storing the records again in model 
		return "redirect:/viewProduct";
	}
}
