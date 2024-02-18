package com.excelr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.excelr.model.Products;
import com.excelr.repository.ExcelrRepo;


@Service
public class ExcelrService implements ExcelrInterface {
	
	@Autowired
	private ExcelrRepo repo;

	@Override
	public void saveProduct(Products product) {
		// TODO Auto-generated method stub
		double total=0.0;
		total=product.getP_cost()*product.getP_quantity();
		product.setTotal_bill(total);
		
		double discount=0.0;
		if(total<10000) {
			discount=total*0.1;
		}else if(total>=10000 && total<=30000) {
			discount=total*0.2;
		}else {
			discount=total*0.3;
		}
		product.setDiscount(discount);

		double gst=1000.00;
		product.setGst(gst);
		
		double invoice=0.0;
		invoice=total-discount+gst;
		product.setInvoice(invoice);
		
		repo.save(product);
	}

	@Override
	public List<Products> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		 repo.deleteById(id);
		
	}

	@Override
	public Products getProduct(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

}
