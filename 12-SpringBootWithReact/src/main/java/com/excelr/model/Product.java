package com.excelr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	private int id;
	private String name;
	private double cost;
	private String image;
	private double s_tax;
	private double c_tax;
	private double finalBill;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, double cost, String image, double s_tax, double c_tax, double finalBill) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.image = image;
		this.s_tax = s_tax;
		this.c_tax = c_tax;
		this.finalBill = finalBill;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + ", image=" + image + ", s_tax=" + s_tax
				+ ", c_tax=" + c_tax + ", finalBill=" + finalBill + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getS_tax() {
		return s_tax;
	}
	public void setS_tax(double s_tax) {
		this.s_tax = s_tax;
	}
	public double getC_tax() {
		return c_tax;
	}
	public void setC_tax(double c_tax) {
		this.c_tax = c_tax;
	}
	public double getFinalBill() {
		return finalBill;
	}
	public void setFinalBill(double finalBill) {
		this.finalBill = finalBill;
	}
	
	

}
