package com.model;

import jakarta.persistence.Entity;

@Entity
public class Product {

	private int id;
	private String Name;
	private int price;
	private String Info;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getInfo() {
		return Info;
	}
	public void setInfo(String info) {
		Info = info;
	}
	
}
