package com.Practice.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.Practice.VO.UserVO;

@Repository
public class UserDao {
	
	private ConnectionMaker connectionmaker;
	
	public UserDao(ConnectionMaker connectionMaker) {
		this.connectionmaker = connectionMaker;
	}
	
	public void add(UserVO user) throws SQLException, ClassNotFoundException {
		Connection c = connectionmaker.makeConnection();
		PreparedStatement ps = c.prepareStatement("insert into users values(?,?,?);");
		ps.setString(1, user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());
		
		ps.executeUpdate();
		ps.close();

	}
	

	public UserVO get(String id) throws ClassNotFoundException, SQLException {
		
		Connection c = connectionmaker.makeConnection();
		PreparedStatement ps = c.prepareStatement("SELECT * FROM users WHERE id=?;");
		ps.setString(1,id);
		
		ResultSet rs = ps.executeQuery();
		rs.next();
		UserVO user = new UserVO();
		user.setId(rs.getString("id"));
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));
		
		rs.close();
		ps.close();
		c.close();
		return user;
	}
	
}
