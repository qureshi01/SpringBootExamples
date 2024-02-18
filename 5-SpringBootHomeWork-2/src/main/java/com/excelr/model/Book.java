package com.excelr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
	private int bookId;
	private String bookName;
	private int isbn_no;
	private String author_name;
	private String publisher_name;
	private int price;
	private int publishing_year;
	public Book(int bookId, String bookName, int isbn_no, String author_name, String publisher_name, int price,
			int publishing_year) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.isbn_no = isbn_no;
		this.author_name = author_name;
		this.publisher_name = publisher_name;
		this.price = price;
		this.publishing_year = publishing_year;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getIsbn_no() {
		return isbn_no;
	}
	public void setIsbn_no(int isbn_no) {
		this.isbn_no = isbn_no;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public String getPublisher_name() {
		return publisher_name;
	}
	public void setPublisher_name(String publisher_name) {
		this.publisher_name = publisher_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPublishing_year() {
		return publishing_year;
	}
	public void setPublishing_year(int publishing_year) {
		this.publishing_year = publishing_year;
	}
	
	
	

}
