package com.cloud.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.model.Response;
import com.cloud.model.User;
import com.cloud.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/getUsers") 
	public List<User> getUsers() {
		List<User> userList = userService.getUsers();
		return userList;
	}

	@PostMapping("/saveUsers")
	public Response saveUsers(User user) throws ClassNotFoundException, SQLException {
		Response response = userService.saveUsers(user);
		return response;
	}
}
