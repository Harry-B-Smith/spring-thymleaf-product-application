package com.fdmgroup.productapplication.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.fdmgroup.productapplication.model.User;

@Repository
public class UserMapRepository implements UserRepository{

	private Map<String,User> users;
	
	public UserMapRepository() {
		users = new HashMap<>();
	}

	@Override
	public void save(User user) {
		users.put(user.getEmail(), user);
	}
	
}
