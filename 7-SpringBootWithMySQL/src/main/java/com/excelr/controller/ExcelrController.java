package com.excelr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.excelr.entity.Employees;
import com.excelr.model.User;
import com.excelr.repo.ExcelrRepo;

@Controller
public class ExcelrController {
	
	@Autowired
	private ExcelrRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/addUser")
	public String addUser() {
		return "addUser";
	}
	
	@RequestMapping("/submit")
	public String submit(User user) {
		repo.save(user);
		return "submit";
	}
	
	@RequestMapping("/viewUser")
	public String viewUser(ModelMap model) {
		model.put("users", repo.findAll());
		return "viewUser";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		repo.deleteById(id);
		return "redirect:/viewUser";
	}
	
	@RequestMapping("/edit/{id}")
	public String edit (@PathVariable int id, ModelMap model) {
		model.put("user", repo.findById(id).get());
		return "edit";
	}
	
	@RequestMapping("/updateandsave")
	public String updateandsave(User user) {
		repo.save(user);
		return "redirect:/viewEmployees";
		
	}

}
