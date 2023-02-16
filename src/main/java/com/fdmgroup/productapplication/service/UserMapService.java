package com.fdmgroup.productapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.productapplication.model.User;
import com.fdmgroup.productapplication.repository.UserMapRepository;

@Service
public class UserMapService implements UserService{
	
	private UserMapRepository userRepository;
	
	
	@Autowired
	public UserMapService(UserMapRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}


	@Override
	public boolean createUser(User user) {
		userRepository.save(user);
		return true;
	}

}
