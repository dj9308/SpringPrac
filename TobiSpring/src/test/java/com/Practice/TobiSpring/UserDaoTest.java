package com.Practice.TobiSpring;

import java.sql.SQLException;

import com.Practice.DAO.ConnectionMaker;
import com.Practice.DAO.DConnectionMaker;
import com.Practice.DAO.UserDao;
import com.Practice.VO.UserVO;

public class UserDaoTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ConnectionMaker connectionMaker = new DConnectionMaker();
		UserDao dao = new UserDao(connectionMaker);
		int i =0;
		UserVO user = new UserVO();
		user.setId("testId");
		user.setName("omg");
		user.setPassword("hi");
		while(!dao.get(user.getId()).getId().isEmpty()) {
			i++;
			user.setId("testId"+i);
		}
		dao.add(user);
		
		System.out.println(user.getId()+" ��� ���� ");
		UserVO user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		System.out.println(user.getId()+" ��ȸ ���� ");
	}

}
