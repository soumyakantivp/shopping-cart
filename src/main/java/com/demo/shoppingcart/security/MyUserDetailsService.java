package com.demo.shoppingcart.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.shoppingcart.dao.UserRepo;
import com.demo.shoppingcart.model.User;

@Service
public class MyUserDetailsService implements UserDetailsService{
	@Autowired
	UserRepo repo;
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException{
		return repo.findById(userName).get();
	}
}
