package com.excelr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class User {
	
	@jakarta.persistence.Id
	private int Id;
	private String Name;
	private String Password;
	private String Email;
	private String Sex;
	private String Country;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String password, String email, String sex, String country) {
		super();
		Id = id;
		Name = name;
		Password = password;
		Email = email;
		Sex = sex;
		Country = country;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", Name=" + Name + ", Password=" + Password + ", Email=" + Email + ", Sex=" + Sex
				+ ", Country=" + Country + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	

}
