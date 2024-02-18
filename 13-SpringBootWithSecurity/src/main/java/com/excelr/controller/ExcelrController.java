package com.excelr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExcelrController {

	@GetMapping("/req1")
	public String request1() {
		return "Welcome to request1";
	}
	@GetMapping("/req2")
	public String request2() {
		return "Welcome to request2";
	}
}
