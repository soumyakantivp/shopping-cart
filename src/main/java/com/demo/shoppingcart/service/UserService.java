package com.demo.shoppingcart.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.shoppingcart.dao.OrderRepo;
import com.demo.shoppingcart.model.Item;
import com.demo.shoppingcart.model.OrderItem;

@Service
public class UserService {
	@Autowired
	OrderRepo repo;
	
	public OrderItem getOrderItem(String userid, Integer orderid) {
		return repo.findById(orderid).get();
	}
	
	public List<OrderItem> getOrderItem(String userid) {
		return repo.findByUserId(userid);
	}
	
	public void createOrderItem(String userid, List<Item> items, String paymentMode) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
		items.stream().map(item->new OrderItem(userid, item.getId(), formatter.format(date), "--", paymentMode)).forEach(repo::save);
	}
}
