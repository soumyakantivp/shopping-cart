package com.demo.shoppingcart.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	private String email;
	private String password;
	@Embedded
	private Address address;
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="userId")  
	private List<OrderItem> orders;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<OrderItem> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderItem> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", address=" + address + ", orders=" + orders + "]";
	}
	
	
}
