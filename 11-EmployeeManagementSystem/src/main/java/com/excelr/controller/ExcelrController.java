package com.excelr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.excelr.model.Employee;
import com.excelr.service.ExcelrService;

@Controller
public class ExcelrController {
	
	@Autowired
	 private ExcelrService service;
	
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/addEmployee")
	public String addemployee()
	{
		return "addEmployee";
	}
	
	@RequestMapping("/success")
	public String success(Employee employee)//(4 variables) data will be avialable to the model created
	{
		service.saveEmployee(employee);
		return "success";
		
	}
	@RequestMapping("/viewEmployees")
	public String viewemployees(ModelMap model)
	{
		model.put("employees", service.getallemp());
		return "viewEmployees";
	}
	@RequestMapping("/deletemp/{id}")
	public String deleteemp(@PathVariable int id)
	{
		service.deleteEmployee(id);
		return "redirect:/viewEmployees";
	}
	@RequestMapping("/editemp/{id}")
	public String editemp(@PathVariable int id, ModelMap model)  //fetching the records
	{
		model.put("employee",service.getemp(id));   //storing the records again in model 
		return "editEmp";
	}
	@RequestMapping("/updateandsave")
	public String updateandsave(Employee employee)  //fetching the records
	{
		service.saveEmployee(employee);  //storing the records again in model 
		return "redirect:/viewEmployees";
	}
	
	
	
	

}

