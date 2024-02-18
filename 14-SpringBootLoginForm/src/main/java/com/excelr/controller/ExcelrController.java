package com.excelr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.model.User;
import com.excelr.service.ExcelrService;

@RestController
public class ExcelrController {
	
	@Autowired
	private ExcelrService service;

	@PostMapping("/login")
	public User login(@RequestBody String username) {
		return service.findByUserName(username);
	}
}
