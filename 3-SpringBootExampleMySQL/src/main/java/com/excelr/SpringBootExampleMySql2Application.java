package com.excelr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.excelr.model.Products;
import com.excelr.repo.ExcelrRepo;

@SpringBootApplication
public class SpringBootExampleMySql2Application implements CommandLineRunner {
	
	@Autowired
	private ExcelrRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleMySql2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
				Products p1 = new Products(111,"p_one",10000);
				repo.save(p1);
			
				
				Products p2 = new Products(222, "p_two",20000);
				Products p3 = new Products(333, "p_three",30000);
				Products p4 = new Products(444, "p_four",40000);
				Products p5 = new Products(555, "p_five",50000);
				ArrayList<Products> arrayList = new ArrayList<Products>();
				arrayList.add(p2);
				arrayList.add(p3);
				arrayList.add(p4);
				arrayList.add(p5);
				repo.saveAll(arrayList);
				
				
				
				Products p5s=repo.findById(555).get();
				System.out.println(p5s);
//				
//				
				Products p4s=repo.findById(444).get();
				p4s.setP_name("product_four");
				p4s.setP_cost(400000);
				repo.save(p4s);
//				
//				
				repo.deleteById(555);
//				
//				
				List<Products> all = (List<Products>) repo.findAll();
				System.out.println(all);
				
				
	}

}
