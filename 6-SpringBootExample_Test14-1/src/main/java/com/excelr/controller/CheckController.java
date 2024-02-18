package com.excelr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CheckController {
		@RequestMapping("/check")
		public String check() {
			return "check";
		}

		@RequestMapping("/result")
		public String result(@RequestParam int value,
				ModelMap model) {
			
			
			model.put("value", value);
			
			//int total=value;
			//model.put("total", total);
			
			String s=null;
			if(value<0) {
				 s="Negative";
			}else {
				 s="Positive";
			}
			model.put("s", s);
			return "result";
			
		}
			
		}
