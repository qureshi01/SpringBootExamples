package com.excelr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees_list")
public class Employees {
	
	@Id
	@Column(name="id")
	private int e_id;
	@Column(name="name")
	private String e_name;
	@Column(name="email")
	private String e_email;
	@Column(name="dept")
	private String e_dept;
	@Column(name="sal")
	private double e_sal;
	@Column(name="address")
	private String e_address;
	@Column(name="image")
	private String e_image;
	public Employees(int e_id, String e_name, String e_email, String e_dept, double e_sal, String e_address,
			String e_image) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_email = e_email;
		this.e_dept = e_dept;
		this.e_sal = e_sal;
		this.e_address = e_address;
		this.e_image = e_image;
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employees [e_id=" + e_id + ", e_name=" + e_name + ", e_email=" + e_email + ", e_dept=" + e_dept
				+ ", e_sal=" + e_sal + ", e_address=" + e_address + ", e_image=" + e_image + "]";
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getE_email() {
		return e_email;
	}
	public void setE_email(String e_email) {
		this.e_email = e_email;
	}
	public String getE_dept() {
		return e_dept;
	}
	public void setE_dept(String e_dept) {
		this.e_dept = e_dept;
	}
	public double getE_sal() {
		return e_sal;
	}
	public void setE_sal(double e_sal) {
		this.e_sal = e_sal;
	}
	public String getE_address() {
		return e_address;
	}
	public void setE_address(String e_address) {
		this.e_address = e_address;
	}
	public String getE_image() {
		return e_image;
	}
	public void setE_image(String e_image) {
		this.e_image = e_image;
	}
	
	

}
