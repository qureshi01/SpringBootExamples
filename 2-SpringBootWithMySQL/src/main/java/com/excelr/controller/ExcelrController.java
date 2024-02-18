package com.excelr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.excelr.entity.Employees;
import com.excelr.model.Products;
import com.excelr.repo.ExcelrRepo;

@Controller
public class ExcelrController {
	
	@Autowired
	private ExcelrRepo repo;
	
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
		repo.save(product);
		return "success";
	}
	
	@RequestMapping("/viewProducts")
	public String viewProducts(ModelMap model) {
		model.put("products", repo.findAll());
		return "viewProducts";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		repo.deleteById(id);
		return "redirect:/viewProducts";
	}
	
	@RequestMapping("/edit/{id}")
	public String edit (@PathVariable int id, ModelMap model) {
		model.put("product", repo.findById(id).get());
		return "editProduct";
	}
	
	@RequestMapping("/updateandsave")
	public String updateandsave(Products product) {
		repo.save(product);
		return "redirect:/viewProducts";
		
	}

	
}
