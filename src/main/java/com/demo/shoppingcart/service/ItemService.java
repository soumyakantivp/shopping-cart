package com.demo.shoppingcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.shoppingcart.dao.ItemRepo;
import com.demo.shoppingcart.model.Item;

@Service
public class ItemService {
	@Autowired
	ItemRepo repo;
	
	public List<Item> getItems(){
		return repo.findAll();
	}
	
	public List<Item> getItemsInCategory(String category){
		return repo.findByCategory(category);
	}
	
	public List<Item> getItemsInPriceRange(Double from, Double to){
		return repo.findAll().stream().filter(item->item.getPrice()>=from && item.getPrice()<=to).toList();
	}

	public List<Item> getItemsSortedPrice() {
		return repo.findAll().stream().sorted((item1,item2) -> (int)(item1.getPrice()-item2.getPrice())).toList();
	}
}
