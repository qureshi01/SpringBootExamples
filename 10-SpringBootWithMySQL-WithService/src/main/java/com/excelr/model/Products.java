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
	private String p_image;
	private double total_bill;
	private double discount;
	private double gst;
	private double invoice;
	public Products(int p_id, String p_name, double p_cost, int p_quantity, String p_image, double total_bill,
			double discount, double gst, double invoice) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_cost = p_cost;
		this.p_quantity = p_quantity;
		this.p_image = p_image;
		this.total_bill = total_bill;
		this.discount = discount;
		this.gst = gst;
		this.invoice = invoice;
	}
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Products [p_id=" + p_id + ", p_name=" + p_name + ", p_cost=" + p_cost + ", p_quantity=" + p_quantity
				+ ", p_image=" + p_image + ", total_bill=" + total_bill + ", discount=" + discount + ", gst=" + gst
				+ ", invoice=" + invoice + "]";
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
	public String getP_image() {
		return p_image;
	}
	public void setP_image(String p_image) {
		this.p_image = p_image;
	}
	public double getTotal_bill() {
		return total_bill;
	}
	public void setTotal_bill(double total_bill) {
		this.total_bill = total_bill;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getInvoice() {
		return invoice;
	}
	public void setInvoice(double invoice) {
		this.invoice = invoice;
	}
	
	
	

}
