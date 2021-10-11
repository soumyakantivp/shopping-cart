package com.demo.shoppingcart.model;

import java.util.List;

public class PlaceOrder {
	private List<Item> items;
	String paymentMode;
	
	
	public PlaceOrder() {
		super();
	}
	public PlaceOrder(List<Item> items, String paymentMode) {
		super();
		this.items = items;
		this.paymentMode = paymentMode;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public String getpaymentMode() {
		return paymentMode;
	}
	public void setpaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	@Override
	public String toString() {
		return "PlaceOrder [items=" + items + ", paymentMode=" + paymentMode + "]";
	}
	
	
}
