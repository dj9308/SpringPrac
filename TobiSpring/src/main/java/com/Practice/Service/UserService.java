package com.Practice.Service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.Practice.DAO.ConnectionMaker;
import com.Practice.DAO.DConnectionMaker;
import com.Practice.DAO.UserDao;
import com.Practice.VO.UserVO;

@Service
public class UserService {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ConnectionMaker connectionMaker = new DConnectionMaker();
		UserDao dao = new UserDao(connectionMaker);
		
		UserVO user = new UserVO();
		user.setId("test2");
		user.setName("omg");
		user.setPassword("hi");
		
		dao.add(user);
		
		System.out.println(user.getId()+" 등록 성공 ");
		UserVO user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		System.out.println(user.getId()+" 조회 성공 ");
	}

}
