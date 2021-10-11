package com.demo.shoppingcart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.shoppingcart.model.OrderItem;

public interface OrderRepo extends JpaRepository<OrderItem, Integer>{
	public List<OrderItem> findByUserId(String userid);
}
