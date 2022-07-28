package com.cloud.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.cloud.model.User;

@Repository
public class UserDao {

	public String saveUsers(User user) throws SQLException, ClassNotFoundException {

		String result = "Failed";
//		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "post*123");
		PreparedStatement ps = con.prepareStatement("insert into test1.user (id,name,dept) values(?,?,?)");
		int parampos = 1;
		ps.setInt(parampos++, user.getId()); 
		ps.setString(parampos++, user.getUserName());
		ps.setString(parampos++, user.getDept());
		int count = ps.executeUpdate();

		if (count > 1) { 
			result = "Success";
		}
		return result;
	}

}
