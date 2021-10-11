package com.demo.shoppingcart.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	private String userId; // email
	private Integer itemId; 
	private String orderTime;
	private String deliveryTime;
	private String paymentMode;
	
	
	public OrderItem() {
		super();
	}
	public OrderItem(String userId, Integer itemId, String orderTime, String deliveryTime,
			String paymentMode) {
		super();
		this.userId = userId;
		this.itemId = itemId;
		this.orderTime = orderTime;
		this.deliveryTime = deliveryTime;
		this.paymentMode = paymentMode;
	}
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public String getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	@Override
	public String toString() {
		return "Order [userId=" + userId + ", itemId=" + itemId + ", orderTime=" + orderTime + ", deliveryTime="
				+ deliveryTime + ", paymentMode=" + paymentMode + "]";
	}
	
	
}
