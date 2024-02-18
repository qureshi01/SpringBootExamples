package com.excelr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Products {
	
	@Id
	private int p_id;
	private String p_name;
	private double p_cost;
	private int p_quantity;
	private double p_total_price;
	private int p_gst;
	private double p_discount;
	private double p_invoice;
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(int p_id, String p_name, double p_cost, int p_quantity, double p_total_price, int p_gst,
			double p_discount, double p_invoice) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_cost = p_cost;
		this.p_quantity = p_quantity;
		this.p_total_price = p_total_price;
		this.p_gst = p_gst;
		this.p_discount = p_discount;
		this.p_invoice = p_invoice;
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
	public int getP_quantity() {
		return p_quantity;
	}
	public void setP_quantity(int p_quantity) {
		this.p_quantity = p_quantity;
	}
	public double getP_total_price() {
		return p_total_price;
	}
	public void setP_total_price(double p_total_price) {
		this.p_total_price = p_total_price;
	}
	public int getP_gst() {
		return p_gst;
	}
	public void setP_gst(int p_gst) {
		this.p_gst = p_gst;
	}
	public double getP_discount() {
		return p_discount;
	}
	public void setP_discount(double p_discount) {
		this.p_discount = p_discount;
	}
	public double getP_invoice() {
		return p_invoice;
	}
	public void setP_invoice(double p_invoice) {
		this.p_invoice = p_invoice;
	}
	@Override
	public String toString() {
		return "Products [p_id=" + p_id + ", p_name=" + p_name + ", p_cost=" + p_cost + ", p_quantity=" + p_quantity
				+ ", p_total_price=" + p_total_price + ", p_gst=" + p_gst + ", p_discount=" + p_discount
				+ ", p_invoice=" + p_invoice + "]";
	}
	
	
	
}
