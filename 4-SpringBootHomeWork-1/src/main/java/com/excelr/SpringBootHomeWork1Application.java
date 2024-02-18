package com.excelr;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.excelr.Repo.ExcelrRepo;
import com.excelr.model.mobile;

@SpringBootApplication
public class SpringBootHomeWork1Application implements CommandLineRunner {

	@Autowired
	private ExcelrRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHomeWork1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		mobile m1 = new mobile(1,"M1","C1",1,1,"OS1","PN1",1000,1,1,1);
		mobile m2 = new mobile(2,"M2","C2",2,2,"OS2","PN2",2000,2,2,2);
		mobile m3 = new mobile(3,"M3","C3",3,3,"OS3","PN3",3000,3,3,3);
		mobile m4 = new mobile(4,"M4","C4",4,4,"OS4","PN4",4000,4,4,4);
		mobile m5 = new mobile(5,"M5","C5",5,5,"OS5","PN5",5000,5,5,5);
		mobile m6 = new mobile(6,"M6","C6",6,6,"OS6","PN6",6000,6,6,6);
		mobile m7 = new mobile(7,"M7","C7",7,7,"OS7","PN7",7000,7,7,7);
		mobile m8 = new mobile(8,"M8","C8",8,8,"OS8","PN8",8000,8,8,8);
		mobile m9 = new mobile(9,"M9","C9",9,9,"OS9","PN9",9000,9,9,9);
		mobile m10 = new mobile(10,"M10","C10",10,10,"OS10","PN10",10000,10,10,10);
		
		ArrayList<mobile> al = new ArrayList<mobile>();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		al.add(m5);
		al.add(m6);
		al.add(m7);
		al.add(m8);
		al.add(m9);
		al.add(m10);
		repo.saveAll(al);
		
		mobile m4u=repo.findById(4).get();
		m4u.setModelName("samsung");
		m4u.setImei_no(2020);
		
		mobile m5u=repo.findById(5).get();
		m5u.setCompany_Name("Apple");
		m5u.setPrice(100000);
		
		repo.save(m4u);
		repo.save(m5u);
		
		repo.deleteById(9);
		
		

		
	}

}
