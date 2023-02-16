package com.fdmgroup.productapplication.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fdmgroup.productapplication.model.User;
import com.fdmgroup.productapplication.service.UserService;


@Controller
public class UserController {
	
	UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	
	@PostMapping("/createUser")
	public String toCreateUser(@RequestParam String email, 
			@RequestParam String username, @RequestParam String password) {
		User newUser = new User(email, username, password);
		System.out.println(newUser);
		
		userService.createUser(newUser);
		
		System.out.println(newUser);
		
//		session.setAttribute("email", email);
//		session.setAttribute("username", username);
//		session.setAttribute("password", password);
		return "index";
	}

}
