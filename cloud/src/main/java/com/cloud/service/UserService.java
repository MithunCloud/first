package com.cloud.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.dao.UserDao;
import com.cloud.model.Response;
import com.cloud.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public List<User> getUsers() {
		List<User> userList = new ArrayList<User>();
		User user = new User();
		user.setId(105);
		user.setUserName("Mithun");
		user.setDept("Java");
		User user1 = new User();
		user1.setId(109);
		user1.setUserName("Manoj");
		user1.setDept("Angular");
		userList.add(user1);
		userList.add(user);
		return userList;
	}

	public Response saveUsers(User user) throws ClassNotFoundException, SQLException {
		Response res = new Response();
		String result = userDao.saveUsers(user);
		
		if(result.equalsIgnoreCase("success")) {
			res.setMessage(result);
			res.setStatus(1); 
		}
		else{
			res.setMessage(result);
			res.setStatus(0);
		}
		return res;
	}

}
