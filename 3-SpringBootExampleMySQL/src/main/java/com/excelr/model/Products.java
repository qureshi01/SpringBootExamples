package com.excelr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Products {
 
	@Id
	private int p_id;
	
	private String p_name;
	private int p_cost;
	
	public Products(int p_id, String p_name, int p_cost) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_cost = p_cost;
	}
	@Override
	public String toString() {
		return "Products [p_id=" + p_id + ", p_name=" + p_name + ", p_cost=" + p_cost + "]";
	}
	public Products() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getP_cost() {
		return p_cost;
	}
	public void setP_cost(int p_cost) {
		this.p_cost = p_cost;
	}
	
	
}
