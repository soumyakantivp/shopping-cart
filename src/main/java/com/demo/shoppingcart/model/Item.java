package com.demo.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Item {
	@Id
	private Integer id;
	private String img;
	private String name;
	private Double price;
	private String category;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getcategory() {
		return category;
	}
	public void setcategory(String category) {
		this.category = category;
	}
	
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", img=" + img + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
	
	
}
