package com.excelr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.excelr.model.Book;
import com.excelr.repo.ExcelrRepo;

@SpringBootApplication
public class SpringBootHomeWork2Application implements CommandLineRunner {

	@Autowired
	private ExcelrRepo books;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHomeWork2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Book b1= new Book(1,"A",1,"A","A",10,2023);
		Book b2= new Book(2,"B",2,"B","B",20,2023);
		Book b3= new Book(3,"C",3,"C","C",30,2023);
		Book b4= new Book(4,"D",4,"D","D",40,2023);
		Book b5= new Book(5,"E",5,"E","E",50,2023);
		Book b6= new Book(6,"F",6,"F","F",60,2023);
		Book b7= new Book(7,"G",7,"G","G",70,2023);
		Book b8= new Book(8,"H",8,"H","H",80,2023);
		Book b9= new Book(9,"I",9,"I","I",90,2023);
		Book b10= new Book(10,"J",10,"J","J",100,2023);
		
		List<Book> al = new ArrayList<Book>();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		al.add(b5);
		al.add(b6);
		al.add(b7);
		al.add(b8);
		al.add(b9);
		al.add(b10);


		books.saveAll(al);
		
		Book b4u=books.findById(5).get();
		b4u.setAuthor_name("Hashim");
		b4u.setBookName("Welcome");
		
		Book b5u = books.findById(6).get();
		b5u.setIsbn_no(234);
		b5u.setPublishing_year(2024);
		
		books.save(b4u);
		books.save(b5u);

		books.deleteById(2);

	}

}
