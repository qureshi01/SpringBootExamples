package com.excelr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.model.Product;
import com.excelr.repo.ExcelrRepo;

@Service
public class ExcelrService implements ExcelrInterface {

	@Autowired
	private ExcelrRepo repo;
	
	
	@Override
	public Product saveData(Product product) {
		// TODO Auto-generated method stub
		double state=0.0;
		state=product.getCost()*0.3;
		product.setS_tax(state);
		
		double central=0.0;
		central=product.getCost()*0.12;
		product.setC_tax(central);
		
		double finalbill=0.0;
		finalbill=product.getCost()+state+central;
		product.setFinalBill(finalbill);
		
		repo.save(product);
		return product;
	}

}
