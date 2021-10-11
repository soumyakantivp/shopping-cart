package com.demo.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.shoppingcart.model.Item;
import com.demo.shoppingcart.service.ItemService;

@RestController
public class ItemController {
	@Autowired
	ItemService service;
	
	@RequestMapping(value = "/items",method =RequestMethod.GET)
	public List<Item> getItems(){
		return service.getItems();
	}
	
	@RequestMapping(value = "/items/{category}",method =RequestMethod.GET)
	public List<Item> getItems(@PathVariable String category){
		return service.getItemsInCategory(category);
	}
	
	@RequestMapping(value = "/items/pricerange/{from}/{to}",method =RequestMethod.GET)
	public List<Item> getItems(@PathVariable Double from,@PathVariable Double to){
		return service.getItemsInPriceRange(from, to);
	}
	
	@RequestMapping(value = "/items/sorted/price",method =RequestMethod.GET)
	public List<Item> getSortedItems(){
		return service.getItemsSortedPrice();
	}
}
