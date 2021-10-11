package com.demo.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.shoppingcart.model.OrderItem;
import com.demo.shoppingcart.model.PlaceOrder;
import com.demo.shoppingcart.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class UserController {
	@Autowired
	UserService service;
	
	@RequestMapping(value = "user/{userid}/order")
	public List<OrderItem> getOrderById(@PathVariable String userid) {
		return service.getOrderItem(userid);
	}
	
	@RequestMapping(value = "user/{userid}/order/{orderid}")
	public OrderItem getOrderById(@PathVariable String userid, @PathVariable Integer orderid) {
		return service.getOrderItem(userid, orderid);
	}
	
	@RequestMapping(value = "user/{userid}/order", method = RequestMethod.POST, consumes = "application/json")
	public void createOrder(@PathVariable String userid, @RequestBody String requestBody) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			PlaceOrder order = objectMapper.readValue(requestBody, PlaceOrder.class);
			service.createOrderItem(userid, order.getItems(), order.getpaymentMode());
		} catch (JsonProcessingException e) {
			System.out.println("wrong data for place order");
			e.printStackTrace();
		}
	}
}
