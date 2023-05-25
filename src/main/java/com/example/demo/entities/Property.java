package com.example.demo.entities;

public class Property {
	private Integer id;
	private String image;
	private String address;
	private String description;
	private String price;
	
	public Property() {
		
	}
	public Property(Integer id, String image, String address, String description, String price) {
		this.id = id;
		this.image = image;
		this.address = address;
		this.description = description;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
