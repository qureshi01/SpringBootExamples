package com.excelr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Product {

	@Id
	private int p_id;
	private String p_name;
	private double p_cost;

	/*
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int p_id, String p_name, double p_cost) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_cost = p_cost;
	}
	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", p_name=" + p_name + ", p_cost=" + p_cost + "]";
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public double getP_cost() {
		return p_cost;
	}
	public void setP_cost(double p_cost) {
		this.p_cost = p_cost;
	}
	*/
	
	
}
