package com.excelr.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="laptops") //Alias Name
public class Products {
	
		@Id
		@Column(name="id") //Alias Name
		private int p_id;
		@Column(name="name")
		private String p_name;
		@Column(name="cost")
		private double p_cost;
		@Column(name="image")
		private String p_image;
		public Products(int p_id, String p_name, double p_cost, String p_image) {
			super();
			this.p_id = p_id;
			this.p_name = p_name;
			this.p_cost = p_cost;
			this.p_image = p_image;
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
		public double getP_cost() {
			return p_cost;
		}
		public void setP_cost(double p_cost) {
			this.p_cost = p_cost;
		}
		public String getP_image() {
			return p_image;
		}
		public void setP_image(String p_image) {
			this.p_image = p_image;
		}
		@Override
		public String toString() {
			return "Products [p_id=" + p_id + ", p_name=" + p_name + ", p_cost=" + p_cost + ", p_image=" + p_image
					+ "]";
		}
		
		
}
