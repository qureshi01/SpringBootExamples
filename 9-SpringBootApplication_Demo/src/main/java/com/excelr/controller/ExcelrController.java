package com.excelr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.excelr.entity.Employees;
import com.excelr.repository.ExcelrRepo;

@Controller
public class ExcelrController {
	
	@Autowired
	private ExcelrRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee() {
		return "addEmployee";
	}
	
	@RequestMapping("/success")
	public String success(Employees employee) {
		repo.save(employee);
		return "success";
	}
	
	@RequestMapping("/viewEmployees")
	public String viewEmployees(ModelMap model) {
		model.put("employees", repo.findAll());
		return "viewEmployees";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		repo.deleteById(id);
		return "redirect:/viewEmployees";
	}
	
	@RequestMapping("/edit/{id}")
	public String edit (@PathVariable int id, ModelMap model) {
		model.put("employee", repo.findById(id).get());
		return "edit";
	}
	
	@RequestMapping("/updateandsave")
	public String updateandsave(Employees employee) {
		repo.save(employee);
		return "redirect:/viewEmployees";
		
	}

}
