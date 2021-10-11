package com.demo.shoppingcart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.shoppingcart.model.Item;

public interface ItemRepo extends JpaRepository<Item, Integer>{
	public List<Item> findByCategory(String category);
}
