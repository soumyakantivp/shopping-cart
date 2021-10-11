package com.demo.shoppingcart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.shoppingcart.model.User;

public interface UserRepo extends JpaRepository<User, String>{

}
