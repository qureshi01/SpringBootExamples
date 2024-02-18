package com.excelr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExcelrController {
	
	@RequestMapping("/display")
	public String display() {
		return "display";
	}
		
	
}
