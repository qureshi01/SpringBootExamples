package com.excelr.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.excelr.model.Product;
import com.excelr.repo.ExcelRRepo;


@RestController
@CrossOrigin("*")
@RequestMapping("/excelr")
public class ExceleRController {
	
	@Autowired
	private ExcelRRepo repo;
	
	@RequestMapping(value = "save",method = RequestMethod.POST)
	public Product saveProduct(@RequestBody Product product) {
		return repo.save(product);
	}
	
	@RequestMapping(value = "all",method = RequestMethod.GET)
	public List<Product> getAllProducts(){
		return repo.findAll();
	}
	
	@RequestMapping(value = "all/{id}",method = RequestMethod.GET)
	public Optional<Product> getProduct(@PathVariable Long id) {
		return repo.findById(id);
	}
	
	@RequestMapping(value = "delete/{id}",method = RequestMethod.DELETE)
	public String deleteProduct(@PathVariable Long id) {
		repo.deleteById(id);
		return "record deleted successfully";
	}
	
	
	@RequestMapping(value = "update",method = RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {
		return repo.save(product);
	}
	
	
	
}
